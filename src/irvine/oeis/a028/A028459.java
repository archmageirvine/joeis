package irvine.oeis.a028;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028459 Number of perfect matchings in graph P_{2} X C_{7} X P_{n}.
 * @author Sean A. Irvine
 */
public class A028459 extends Sequence0 {

  // After Steven Kotlarz

  private final int mNv;
  private final int[][] mEdges;
  private final int mStride;
  private final Map<Integer, Map<Integer, Long>> mLayerCache = new HashMap<>();

  private int mN = -1;
  private Map<Integer, Z> mVec = new HashMap<>();

  protected A028459(final int p, final int c, final int stride) {
    mStride = stride;
    mNv = p * c;
    final List<int[]> edges = new ArrayList<>();
    // Cycle edges within each layer.
    for (int pp = 0; pp < p; ++pp) {
      for (int cc = 0; cc < c; ++cc) {
        edges.add(new int[] {pp * c + cc, pp * c + (cc + 1) % c});
      }
    }
    // Vertical edges between P-layers.
    for (int pp = 0; pp < p - 1; ++pp) {
      for (int cc = 0; cc < c; ++cc) {
        edges.add(new int[] {pp * c + cc, (pp + 1) * c + cc});
      }
    }
    mEdges = edges.toArray(new int[0][]);
    mVec.put(0, Z.ONE);
  }

  /** Construct the sequence. */
  public A028459() {
    this(2, 7, 1);
  }

  private Map<Integer, Long> layer(final int inc) {
    final Map<Integer, Long> cache = mLayerCache.get(inc);
    if (cache != null) {
      return cache;
    }

    final Map<Integer, Long> res = new HashMap<>();

    class Rec {
      void search(final int v, final int used, final int og) {
        if (v == mNv) {
          res.merge(og, 1L, Long::sum);
          return;
        }

        if (((used >>> v) & 1) != 0) {
          search(v + 1, used, og);
          return;
        }

        if (((inc >>> v) & 1) != 0) {
          search(v + 1, used | (1 << v), og);
          return;
        }

        // Match to next layer
        search(v + 1, used | (1 << v), og | (1 << v));

        // Internal edge matching
        for (final int[] e : mEdges) {
          final int a = e[0];
          final int b = e[1];
          final int w;
          if (a == v) {
            w = b;
          } else if (b == v) {
            w = a;
          } else {
            continue;
          }

          if (w > v && ((used >>> w) & 1) == 0 && ((inc >>> w) & 1) == 0) {
            search(v + 1, used | (1 << v) | (1 << w), og);
          }
        }
      }
    }

    new Rec().search(0, 0, 0);
    mLayerCache.put(inc, res);
    return res;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0) {
        return Z.ONE;
      }
      final Map<Integer, Z> nv = new HashMap<>();
      for (final Map.Entry<Integer, Z> e : mVec.entrySet()) {
        final int state = e.getKey();
        final Z cnt = e.getValue();
        for (final Map.Entry<Integer, Long> t : layer(state).entrySet()) {
          nv.merge(t.getKey(), cnt.multiply(t.getValue()), Z::add);
        }
      }
      mVec = nv;
      if (mN % mStride == 0) {
        return mVec.getOrDefault(0, Z.ZERO);
      }
    }
  }
}

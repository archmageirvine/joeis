package irvine.oeis.a028;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028466 Number of perfect matchings in graph C_{3} X C_{5} X P_{2n}.
 * @author Sean A. Irvine
 */
public class A028466 extends Sequence0 {

  private final int mNv;
  private final int[][] mEdges;
  private final int mStride;
  private final Map<Integer, Map<Integer, Long>> mLayerCache = new HashMap<>();

  private int mN = -1;
  private Map<Integer, Z> mVec = new HashMap<>();

  protected A028466(final int c1, final int c2, final int stride) {
    mStride = stride;
    mNv = c1 * c2;
    final List<int[]> edges = new ArrayList<>();
    // Cycle edges within each layer.
    for (int pp = 0; pp < c1; ++pp) {
      for (int cc = 0; cc < c2; ++cc) {
        edges.add(new int[] {pp * c2 + cc, pp * c2 + (cc + 1) % c2});
      }
    }
    // Vertical edges between P-layers.
    for (int pp = 0; pp < c1; ++pp) {
      for (int cc = 0; cc < c2; ++cc) {
        edges.add(new int[] {pp * c2 + cc, ((pp + 1) % c1) * c2 + cc});
      }
    }
    mEdges = edges.toArray(new int[0][]);
    mVec.put(0, Z.ONE);
  }

  /** Construct the sequence. */
  public A028466() {
    this(3, 5, 2);
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

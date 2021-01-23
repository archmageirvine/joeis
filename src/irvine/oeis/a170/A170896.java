package irvine.oeis.a170;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A170896 Number of ON cells after n generations of the Schrandt-Ulam cellular automaton on the square grid that is described in the Comments.
 * @author Sean A. Irvine
 */
public class A170896 implements Sequence {

  private static final int[] DELTA = {1, -1, 0, 0};

  private Set<Pair<Integer, Integer>> mOn = null;
  protected Set<Pair<Integer, Integer>> mNewlyOn = new HashSet<>();
  //private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  //private int mStep = -1;

  protected boolean accept(final Pair<Integer, Integer> pt) {
    return true;
  }

  protected void reset() {
    mOn = null;
    mNewlyOn.clear();
  }

  @Override
  public Z next() {
    if (mOn == null) {
      mOn = new HashSet<>();
    } else {
      final HashMap<Pair<Integer, Integer>, Set<Pair<Integer, Integer>>> next = new HashMap<>();
      final HashSet<Pair<Integer, Integer>> outers = new HashSet<>();
      if (mOn.isEmpty()) {
        next.put(new Pair<>(0, 0), Collections.emptySet());
      } else {
        for (final Pair<Integer, Integer> pt : mNewlyOn) {
          final int x = pt.left();
          final int y = pt.right();
          for (int k = 0; k < DELTA.length; ++k) {
            final int nx = x + DELTA[k];
            final int ny = y + DELTA[DELTA.length - 1 - k];
            int c = 0;
            for (int j = 0; j < DELTA.length; ++j) {
              final int sx = nx + DELTA[j];
              final int sy = ny + DELTA[DELTA.length - 1 - j];
              if (mOn.contains(new Pair<>(sx, sy)) && ++c > 1) {
                break;
              }
            }
            assert c > 0;
            final Pair<Integer, Integer> n = new Pair<>(nx, ny);
            if (c == 1) {
              final int dx = nx - x;
              final int dy = ny - y;
              final int tx = nx + dx;
              final int ty = ny + dy;
              final HashSet<Pair<Integer, Integer>> o = new HashSet<>();
              o.add(new Pair<>(tx + dy, ty + dx));
              o.add(new Pair<>(tx - dy, ty + dx));
              o.add(new Pair<>(tx + dy, ty - dx));
              o.add(new Pair<>(tx - dy, ty - dx));
              assert o.size() == 2;
              boolean ok = true;
              for (final Pair<Integer, Integer> v : o) {
                if (mOn.contains(v)) {
                  ok = false;
                  break;
                }
              }
              if (ok) {
                outers.addAll(o);
                next.put(n, o);
              }
            }
          }
        }
      }
      mNewlyOn.clear();
      for (final Map.Entry<Pair<Integer, Integer>, Set<Pair<Integer, Integer>>> e : next.entrySet()) {
        final Pair<Integer, Integer> pt = e.getKey();
        if (!outers.contains(pt) && accept(pt)) {
          mNewlyOn.add(pt);
        }
      }
      mOn.addAll(mNewlyOn);
    }
//    if (mVerbose && ++mStep == 145) {
//      System.out.println(mNewlyOn.size() + " " + mNewlyOn);
//      try (final PrintStream out = new PrintStream(new FileOutputStream("A170896." + mStep + ".ppm"))) {
//        final int dim = mStep * 2;
//        out.println("P6 " + dim + " " + dim + " 1");
//        for (int y = 0; y < dim; ++y) {
//          for (int x = 0; x < dim; ++x) {
//            final Pair<Integer, Integer> point = new Pair<>(x - mStep, y - mStep);
//            if (mNewlyOn.contains(point)) {
//              out.print("\0\0\1");
//            } else if (mOn.contains(point)) {
//              out.print("\0\0\0");
//            } else {
//              out.print("\1\1\1");
//            }
//          }
//        }
//      } catch (final IOException e) {
//        throw new RuntimeException(e);
//      }
//    }
    return Z.valueOf(mOn.size());
  }
}

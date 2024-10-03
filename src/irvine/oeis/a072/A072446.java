package irvine.oeis.a072;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072446 Number of connectedness systems on n vertices that contain all singletons.
 * @author Sean A. Irvine
 */
public class A072446 extends Sequence0 {

  protected int mN = -1;
  private int mLimit = 0;
  private long mCount = 0;

  // This function can be used in debugging to check the closure property holds
//  private boolean checkClosure(final Set<Integer> s) {
//    for (final int v : s) {
//      for (final int u : s) {
//        if (u == v) {
//          break;
//        }
//        if ((u & v) != 0 && !s.contains(u | v)) {
//          //System.out.println("Failed: " + v + " " + u + " in " + s);
//          return false;
//        }
//      }
//    }
//    return true;
//  }

  protected boolean accept(final Set<Integer> ps) {
    return true;
  }

  private void search(final Set<Integer> ps, final int bits, final int s) {
    if (bits > mN) {
      if (accept(ps)) {
        ++mCount;
      }
      return;
    }
    for (int t = s; t < mLimit; t = Functions.SWIZZLE.i(t)) {
      assert Integer.bitCount(t) == bits;
      if (!ps.contains(t)) {
        // Form closure resulting from adding the set t
        final Set<Integer> nps = new HashSet<>(ps);
        final LinkedList<Integer> expand = new LinkedList<>();
        expand.add(t);
        while (!expand.isEmpty()) {
          final int u = expand.pollFirst();
          nps.add(u);
          for (final int v : ps) {
            if ((v & u) != 0) {
              if (nps.add(v | u)) {
                expand.add(v | u);
              }
            }
          }
        }
        search(nps, bits, Functions.SWIZZLE.i(t));
      }
    }
    search(ps, bits + 1, (1 << (bits + 1)) - 1);
  }

  @Override
  public Z next() {
    ++mN;
    mLimit = 1 << mN;
    mCount = 0;
    search(new HashSet<>(), 2, 3);
    return Z.valueOf(mCount);
  }
}


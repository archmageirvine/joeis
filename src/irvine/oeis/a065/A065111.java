package irvine.oeis.a065;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065110 If n = D0*10^0 + D1*10^1 + D2*10^2 + .. + Dk*10^k define f(n) = D0*0^10 + D1*1^10 + D2*2^10 + .. + Dk*k^10 (e.g. if n = 421 then f(n) = 4*2^10 + 2*1^10 + 1*0^10 = 4098). Sequence gives values of n such that f(n) is divisible by n.
 * @author Sean A. Irvine
 */
public class A065111 extends A000040 {

  private final HashSet<Z> mDeadEnds = new HashSet<>();
  private final HashSet<Z> mSeenWorkspace = new HashSet<>();

  private final HashSet<Z> mReachable = new HashSet<>();

  private void buildReachable(final Z p) {
    if (p.bitLength() > 16) {
      return; // heuristic
    }
    if (mReachable.add(p)) {
      Z a = Z.ONE;
      do {
        a = a.multiply2();
        final Z x = p.xor(a);
        if (x.isProbablePrime()) {
          buildReachable(x);
        }
      } while (a.compareTo(p) < 0);
    }
  }

  private boolean isIsolated(final Z p) {
    Z a = Z.ONE;
    do {
      a = a.multiply2();
      final Z x = p.xor(a);
      if (x.isProbablePrime()) {
        return false;
      }
    } while (a.compareTo(p) < 0);
    return true;
  }

  private boolean isSolvable(final Z p) {
    Z a = Z.ONE;
    do {
      a = a.multiply2();
      final Z x = p.xor(a);
      if (x.isProbablePrime() && mSeenWorkspace.add(x)) {
        //System.out.println(p + " : " + x);
        if (x.add(1).bitCount() == 1) {
          //System.out.println(x + " True hit mersenne");
          return true; // Found a Mersenne prime
        }
        if (x.compareTo(p) < 0 && !mDeadEnds.contains(x)) {
          //System.out.println(x + " True hit smaller");
          return true; // Reached a smaller number that is not a dead end
        }
        if (isSolvable(x)) {
          //System.out.println(x + " was solvable");
          return true;
        }
      }
    } while (a.compareTo(p) < 0);
    return false;
  }

  {
    mReachable.add(Z.TWO);
    buildReachable(Z.THREE);
    System.out.println("Build done");
  }

  private boolean castDownFilter(final Z p) {
    // Attempt to filter out values for which there might be no path to 2
    for (int k = p.bitLength(); k < 100; ++k) {
      if (p.add(Z.ONE.shiftLeft(k)).isProbablePrime()) {
        System.out.println(p + " + 2^" + k + " is prime");
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (true || mReachable.contains(p)) {
        //System.out.println(p + " is reachable");
//      if (isIsolated(p)) {
//        mDeadEnds.add(p);
//      } else {
        mSeenWorkspace.clear();
        mSeenWorkspace.add(p);
        if (p.isOdd() && !isSolvable(p)) {
          mDeadEnds.add(p);
         // if (castDownFilter(p)) {
            return p;
         // }
        }
      }
//    }
    }
  }
}

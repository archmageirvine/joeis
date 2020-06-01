package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014425 From table of maximal epacts <code>e(p)</code> and corresponding primes p, for <code>x_0=2, x_{m+1} = (x_m)^2-1;</code> sequence gives <code>e(p)</code>.
 * @author Sean A. Irvine
 */
public class A014425 implements Sequence {

//  private final Fast mPrime = new Fast();
//  private long mP = 2;
//  private int mBest = 0;
//
//  private int epact(final long p) {
//    final HashSet<Long> seen = new HashSet<>();
//    long x = 2;
//    while (seen.add(x) /* && x != 0*/) {
//      x = x * x + p - 1;
//      x %= p;
//    }
//    final long y = x;
//    int c = 0;
//    do {
//      x = x * x + p - 1;
//      x %= p;
//      ++c;
//    } while (x != y);
//    System.out.println(p + " " + c + " " + seen.size() + " " + seen);
//    return seen.size();
//  }
//
//  @Override
//  public Z nextQ() {
//    while (true) {
//      mP = mPrime.nextPrime(mP);
//      final int epact = epact(mP);
//      if (epact > mBest) {
//        mBest = epact;
//        return Z.valueOf(epact);
//      }
//    }
//  }

  @Override
  public Z next() {
    throw new UnsupportedOperationException();
  }
}


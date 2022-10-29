package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.UnimplementedSequence;

/**
 * A014423 From table of maximal epacts e(p) and corresponding primes p, for x_1=2, x_{m+1} = (x_m)^2+1; sequence gives e(p).
 * @author Sean A. Irvine
 */
public class A014423 extends Sequence1 implements UnimplementedSequence {

//  private final Fast mPrime = new Fast();
//  private long mP = 1;
//  private int mBest = 0;
//
//  private int epact(final long p) {
//    long x = 2 % p;
//    long y = 2 % p;
//    int c = 0;
//    do {
//      ++c;
//      x = x * x + 1;
//      x %= p;
//      y = y * y + 1;
//      y %= p;
//      y = y * y + 1;
//      y %= p;
//    } while (x != y); //LongUtils.gcd(x, y) == 1);
//    System.out.println(p + " " + c);
//    return c;
//  }
//
//  private int epact0(final long p) {
//    final HashSet<Long> seen = new HashSet<>();
//    long x = 2 % p;
////    x = x * x + 1;
////    x %= p;
//    while (seen.add(x) /* && x != 0*/) {
//      x = x * x + 1;
//      x %= p;
//    }
////    long y = x;
////    int c = 0;
////    do {
////      x = x * x + 1;
////      x %= p;
////      ++c;
////    } while (x != y);
//    System.out.println(p + " " + seen);
//    return seen.size();
//  }
//
//  @Override
//  public Z nextQ() {
//    while (true) {
//      mP = mPrime.nextPrime(mP);
//      System.out.println("p=" + mP);
//      final int epact = epact(mP);
//      if (epact > mBest) {
//        mBest = epact;
//        return Z.valueOf(epact);
//      }
//    }
//  }


  @Override
  public Z next() {
    return null;
  }
}


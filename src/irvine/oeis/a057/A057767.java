package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001359;

/**
 * A057767 Number of twin prime pairs between P(n)^2 and P(n+1)^2 where P(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A057767 extends A000040 {

  private final Sequence mTwins = new A001359();
  private Z mP2 = super.next().square();
  private Z mT = mTwins.next();

  @Override
  public Z next() {
    final Z lo = mP2;
    mP2 = super.next().square();
    long count = 0;
    while (mT.compareTo(lo) < 0) {
      mT = mTwins.next();
    }
    while (mT.add(2).compareTo(mP2) <= 0) {
      ++count;
      mT = mTwins.next();
    }
    return Z.valueOf(count);
  }
}


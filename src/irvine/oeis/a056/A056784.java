package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056784 First nonprime in a sequence of consecutive nonprimes which is at least twice as long as any earlier run of consecutive nonprimes in this list.
 * @author Sean A. Irvine
 */
public class A056784 implements Sequence {

  protected final Fast mPrime = new Fast();
  private Z mP = Z.ZERO;
  private Z mGap = Z.ZERO;
  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z a = mP;
      mP = mPrime.nextPrime(a);
      ++mN;
      final Z diff = mP.subtract(a);
      if (diff.compareTo(mGap) >= 0) {
        mGap = diff.multiply2();
        return a.add(1);
      }
    }
  }
}


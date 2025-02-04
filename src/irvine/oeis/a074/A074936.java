package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001597;
import irvine.oeis.a025.A025475;

/**
 * A074936 Number of perfect powers between two successive nonprime prime powers.
 * @author Sean A. Irvine
 */
public class A074936 extends Sequence1 {

  private final Sequence mPerfectPowers = new A001597();
  private final Sequence mNonprimePowers = new A025475();
  private Z mA = mPerfectPowers.next();
  private Z mB = mNonprimePowers.next();

  @Override
  public Z next() {
    while (mA.compareTo(mB) <= 0) {
      mA = mPerfectPowers.next();
    }
    mB = mNonprimePowers.next();
    long cnt = 0;
    while (mA.compareTo(mB) < 0) {
      ++cnt;
      mA = mPerfectPowers.next();
    }
    return Z.valueOf(cnt);
  }
}

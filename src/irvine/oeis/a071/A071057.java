package irvine.oeis.a071;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A071057 Smallest number m such that m = p(i+1) mod p(i) for 1&lt;=i&lt;=n.
 * @author Sean A. Irvine
 */
public class A071057 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z[] mDivs = {};
  private Z[] mMods = {};

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mDivs = Arrays.copyOf(mDivs, mDivs.length + 1);
    mMods = Arrays.copyOf(mMods, mMods.length + 1);
    mDivs[mDivs.length - 1] = mPrime.nextPrime(mP);
    mMods[mDivs.length - 1] = mP;
    return ZUtils.chineseRemainderTheorem(mDivs, mMods);
  }
}

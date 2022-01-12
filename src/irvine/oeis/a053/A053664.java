package irvine.oeis.a053;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A053664 Smallest number m such that m == i (mod prime(i)) for all 1&lt;=i&lt;=n.
 * @author Sean A. Irvine
 */
public class A053664 extends A000040 {

  private Z[] mDiv = {};
  private Z[] mMod = {};

  @Override
  public Z next() {
    final int n = mDiv.length;
    mDiv = Arrays.copyOf(mDiv, mDiv.length + 1);
    mMod = Arrays.copyOf(mMod, mMod.length + 1);
    mDiv[n] = Z.valueOf(n);
    mMod[n] = super.next();
    return ZUtils.chineseRemainderTheorem(mDiv, mMod).add(1);
  }
}

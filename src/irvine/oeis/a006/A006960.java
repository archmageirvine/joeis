package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A006960 Reverse and Add! sequence starting with 196.
 * @author Sean A. Irvine
 */
public class A006960 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(196) : mA.add(ZUtils.reverse(mA));
    return mA;
  }
}

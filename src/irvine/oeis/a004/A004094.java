package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004094 Powers of 2 written backwards.
 * @author Sean A. Irvine
 */
public class A004094 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return ZUtils.reverse(mN);
  }
}


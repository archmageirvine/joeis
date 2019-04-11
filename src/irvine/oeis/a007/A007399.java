package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A007399 Add <code>8,</code> then reverse digits!.
 * @author Sean A. Irvine
 */
public class A007399 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : ZUtils.reverse(mA.add(8));
    return mA;
  }
}

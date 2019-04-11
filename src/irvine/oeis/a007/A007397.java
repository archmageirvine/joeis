package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A007397 Add <code>5,</code> then reverse digits!.
 * @author Sean A. Irvine
 */
public class A007397 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : ZUtils.reverse(mA.add(5));
    return mA;
  }
}

package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A007396 Add <code>2,</code> then reverse digits!.
 * @author Sean A. Irvine
 */
public class A007396 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : ZUtils.reverse(mA.add(2));
    return mA;
  }
}

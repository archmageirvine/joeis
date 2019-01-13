package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000866.
 * @author Sean A. Irvine
 */
public class A000866 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return new Z(mN.toString(5));
  }
}

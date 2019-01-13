package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004651.
 * @author Sean A. Irvine
 */
public class A004651 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return new Z(mN.toString(12));
  }
}


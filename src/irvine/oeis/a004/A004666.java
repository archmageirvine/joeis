package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004666 Powers of 3 written in base 12. (Next term contains a non-decimal character).
 * @author Sean A. Irvine
 */
public class A004666 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return new Z(mN.toString(12));
  }
}


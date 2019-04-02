package irvine.oeis.a000;

import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000594 Ramanujan's tau function (or Ramanujan numbers, or tau numbers).
 * @author Sean A. Irvine
 */
public class A000594 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return ThetaFunctions.delta24z(++mN).coeff(mN);
  }
}


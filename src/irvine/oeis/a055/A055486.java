package irvine.oeis.a055;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A055486 Number of solutions to sigma(x) = n!.
 * @author Sean A. Irvine
 */
public class A055486 extends A000142 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return InverseSigma.countInverseSigma(super.next());
  }
}

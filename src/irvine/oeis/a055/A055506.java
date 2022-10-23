package irvine.oeis.a055;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A055506 Number of solutions to the equation phi(x) = n!.
 * @author Sean A. Irvine
 */
public class A055506 extends A000142 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Euler.inversePhi(super.next()).size());
  }
}

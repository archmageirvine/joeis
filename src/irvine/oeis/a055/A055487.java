package irvine.oeis.a055;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A055487 Least m such that phi(m) = n!.
 * @author Sean A. Irvine
 */
public class A055487 extends A000142 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Euler.inversePhi(super.next()).first();
  }
}

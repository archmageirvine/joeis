package irvine.oeis.a053;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000225;

/**
 * A053288 Cototient of 2^n - 1.
 * @author Sean A. Irvine
 */
public class A053288 extends A000225 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n = super.next();
    return n.subtract(Euler.phi(n));
  }
}


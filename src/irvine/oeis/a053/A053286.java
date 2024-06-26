package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000051;

/**
 * A053286 Cototient of 2^n + 1.
 * @author Sean A. Irvine
 */
public class A053286 extends A000051 {

  @Override
  public Z next() {
    final Z n = super.next();
    return n.subtract(Functions.PHI.z(n));
  }
}


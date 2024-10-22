package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072694 (p(n)#)^p(n), or n-th primorial raised to n-th prime power.
 * @author Sean A. Irvine
 */
public class A072694 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Functions.PRIMORIAL.z(p).pow(p);
  }
}

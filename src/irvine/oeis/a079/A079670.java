package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a080.A080050;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079670 extends A080050 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Z.ONE.shiftLeft(p.longValueExact()).subtract(1).gcd(Functions.FIBONACCI.z(p)).subtract(1).divide(p).divide(8);
  }
}


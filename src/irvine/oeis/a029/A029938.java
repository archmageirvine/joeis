package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029938 (p-5)(p-7)/24, where p=prime(n).
 * @author Sean A. Irvine
 */
public class A029938 extends A000040 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return p.subtract(5).multiply(p.subtract(7)).divide(24);
  }
}

package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034953 Triangular numbers (A000217) with prime indices.
 * @author Sean A. Irvine
 */
public class A034953 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.multiply(p.add(1)).divide2();
  }
}

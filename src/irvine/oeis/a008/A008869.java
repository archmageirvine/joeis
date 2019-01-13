package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A008869.
 * @author Sean A. Irvine
 */
public class A008869 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z q = super.next();
    return q.pow(63)
      .multiply(q.square().subtract(1))
      .multiply(q.pow(6).subtract(1))
      .multiply(q.pow(8).subtract(1))
      .multiply(q.pow(10).subtract(1))
      .multiply(q.pow(12).subtract(1))
      .multiply(q.pow(14).subtract(1))
      .multiply(q.pow(18).subtract(1));
  }
}

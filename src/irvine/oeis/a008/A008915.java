package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A008915 Order of universal twisted Chevalley group 2_E_6 (q), q = prime power.
 * @author Sean A. Irvine
 */
public class A008915 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z q = super.next();
    return q.pow(36)
      .multiply(q.square().subtract(1))
      .multiply(q.pow(5).add(1))
      .multiply(q.pow(6).subtract(1))
      .multiply(q.pow(8).subtract(1))
      .multiply(q.pow(9).add(1))
      .multiply(q.pow(12).subtract(1));
  }
}

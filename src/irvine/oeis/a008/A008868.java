package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A008868 Order of simple Chevalley group <code>E_8 (q), q =</code> prime power.
 * @author Sean A. Irvine
 */
public class A008868 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z q = super.next();
    return q.pow(120)
      .multiply(q.square().subtract(1))
      .multiply(q.pow(8).subtract(1))
      .multiply(q.pow(12).subtract(1))
      .multiply(q.pow(14).subtract(1))
      .multiply(q.pow(18).subtract(1))
      .multiply(q.pow(20).subtract(1))
      .multiply(q.pow(24).subtract(1))
      .multiply(q.pow(30).subtract(1));
  }
}


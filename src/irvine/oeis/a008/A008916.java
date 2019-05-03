package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A008916 Order of simple twisted Chevalley group <code>2_E_6 (q), q =</code> prime power.
 * @author Sean A. Irvine
 */
public class A008916 extends A000961 {

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
      .multiply(q.pow(12).subtract(1))
      .divide(Z.THREE.gcd(q.add(1)));
  }
}


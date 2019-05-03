package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A008914 Order of simple Chevalley group <code>G_2 (q), q =</code> prime power.
 * @author Sean A. Irvine
 */
public class A008914 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z q = super.next();
    return q.pow(6)
      .multiply(q.square().subtract(1))
      .multiply(q.pow(6).subtract(1));
  }
}


package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001001 Number of sublattices of index n in generic 3-dimensional lattice.
 * @author Sean A. Irvine
 */
public class A001001 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      s = s.add(d.multiply(Functions.SIGMA.z(d)));
    }
    return s;
  }
}

package irvine.oeis.a389;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389363 a(n) is the number of isosceles trapezoids in a triangular grid of side length n.
 * @author Sean A. Irvine
 */
public class A389363 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 2, 4).add(Z.valueOf(mN * mN - 1).multiply(mN * mN - 3).divide(48)).multiply(3);
  }
}


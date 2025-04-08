package irvine.oeis.a382;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A382784 Irregular triangle T(n,k) read by rows of the coefficients of Pi^(2k) in the expansion of Sum_{k&gt;=1} (1 / (4k^2-1)^n) with denominator 2^(2n)*(n-1)!.
 * @author Sean A. Irvine
 */
public class A382784 extends A382782 {

  @Override
  protected Z select(final int n, final Q coeff) {
    return coeff.multiply(Functions.FACTORIAL.z(n - 1).shiftLeft(2L * n)).toZ();
  }
}

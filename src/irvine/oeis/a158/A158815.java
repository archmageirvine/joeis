package irvine.oeis.a158;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A158815 Triangle T(n,k) read by rows, matrix product of A046899(row-reversed) * A130595.
 * <code>T(n, k) = Sum_{j=0..n} binomial(j, k)*binomial(2*n-j, n)</code>
 * @author Georg Fischer
 */
public class A158815 extends Triangle {

  /** Construct the sequence. */
  public A158815() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Integers.SINGLETON.sum(0, n, j ->
      ((((j + k) & 1) == 0) ? Z.ONE : Z.NEG_ONE).multiply(Binomial.binomial(j, k)).multiply(Binomial.binomial(2L * n - j, n)));
  }
}

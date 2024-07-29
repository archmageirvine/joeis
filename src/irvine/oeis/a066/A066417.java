package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A066417 Sum of anti-divisors of n.
 * Also denoted by sigma*(n).
 * @author Sean A. Irvine
 */
public class A066417 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.equals(Z.ONE)) {
      return Z.ZERO;
    }
    Z m = n;
    int k = 0;
    while (m.and(Z.ONE).isZero()) {
      m = m.shiftRight(1);
      ++k;
    }
    return Functions.SIGMA1.z(n.multiply2().add(1))
      .add(Functions.SIGMA1.z(n.multiply2().subtract(1)))
      .add(Functions.SIGMA1.z(m).shiftLeft(k + 1))
      .subtract(n.multiply(6).add(2));
  }

  @Override
  public Z a(final int n) {
    if (n == 1) {
      return Z.ZERO;
    }
    long m = n;
    int k = 0;
    while ((m & 1) == 0) {
      m >>>= 1;
      ++k;
    }
    return Functions.SIGMA1.z(2 * n + 1)
      .add(Functions.SIGMA1.z(2 * n - 1))
      .add(Functions.SIGMA1.z(m).shiftLeft(k + 1))
      .subtract(6L * n + 2);
  }

}

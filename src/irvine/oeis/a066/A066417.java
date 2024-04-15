package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066417 Sum of anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A066417 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long m = mN;
    int k = 0;
    while ((m & 1) == 0) {
      m >>>= 1;
      ++k;
    }
    return Functions.SIGMA.z(2 * mN + 1)
      .add(Functions.SIGMA.z(2 * mN - 1))
      .add(Functions.SIGMA.z(m).shiftLeft(k + 1))
      .subtract(6 * mN + 2);
  }
}

package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080983 Smallest triangular number having n^2 as divisor.
 * @author Sean A. Irvine
 */
public class A080983 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).square();
    long k = 0;
    while (!Functions.TRIANGULAR.z(++k).mod(s).isZero()) {
      // do nothing
    }
    return Functions.TRIANGULAR.z(k);
  }
}


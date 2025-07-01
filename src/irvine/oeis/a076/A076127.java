package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076127 n-th term is binary string of length t_n with 1's at positions t_i, where t_n = n-th triangular number.
 * @author Sean A. Irvine
 */
public class A076127 extends Sequence0 {

  private Z mA = Z.ZERO;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.setBit(Functions.TRIANGULAR.i(mN) - 1);
    }
    return new Z(Functions.REVERSE.z(2, mA).toString(2));
  }
}

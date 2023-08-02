package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001716 Generalized Stirling numbers.
 * @author Sean A. Irvine
 */
public class A001716 extends Sequence0 {

  private long mN = -1;

  protected long offset() {
    return 1;
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    final long o = offset();
    for (int k = 0; k <= mN; ++k) {
      final Z t = Binomial.binomial(k + o, o).multiply(Stirling.firstKind(mN + o, k + o)).shiftLeft(2L * k);
      s = s.signedAdd(((mN + k) & 1) == 0, t);
    }
    return s;
  }

}

package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002741 Logarithmic numbers: expansion of the e.g.f. -log(1-x) * e^(-x).
 * @author Sean A. Irvine
 */
public class A002741 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    final Z nf = Functions.FACTORIAL.z(mN);
    for (int k = 0; k < mN; ++k) {
      s = s.signedAdd((k & 1) == 0, nf.divide(Functions.FACTORIAL.z(k)).divide(mN - k));
    }
    return s;
  }
}

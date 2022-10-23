package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005156 Number of alternating sign 2n+1 X 2n+1 matrices symmetric about the vertical axis (VSASM's); also 2n X 2n off-diagonally symmetric alternating sign matrices (OSASM's).
 * @author Sean A. Irvine
 */
public class A005156 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q p = new Q(-3).pow(mN * mN);
    for (int i = 1; i <= 2 * mN + 1; ++i) {
      for (int j = 1; j <= mN; ++j) {
        p = p.multiply(6 * j - 3 * i + 1).divide(2 * j - i + 2 * mN + 1);
      }
    }
    return p.toZ();
  }
}


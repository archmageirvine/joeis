package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004248 Array read by ascending antidiagonals: A(n, k) = k^n.
 * @author Sean A. Irvine
 */
public class A004248 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 0;
      ++mN;
    }
    return Z.valueOf(mM).pow(mN - mM);
  }
}

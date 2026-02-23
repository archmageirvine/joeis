package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391365 Array read by antidiagonals: A(n,k) = reverse(n*k) = A004086(n*k).
 * @author Sean A. Irvine
 */
public class A391365 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.REVERSE.z(mM * (mN - mM));
  }
}

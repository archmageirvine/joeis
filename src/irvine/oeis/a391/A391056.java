package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391056 allocated for Werner Schulte.
 * @author Sean A. Irvine
 */
public class A391056 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    final long q = mN / 3;
    return Functions.TRIANGULAR.z(q).multiply(9).add((3 * q + 2) * (mN % 3)).subtract(3 * mM);
  }
}


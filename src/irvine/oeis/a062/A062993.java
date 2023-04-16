package irvine.oeis.a062;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062993 A triangle (lower triangular matrix) composed of Pfaff-Fuss (or Raney) sequences.
 * @author Sean A. Irvine
 */
public class A062993 extends Sequence1 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return n - m >= 0 ? Binomial.binomial((m + 2L) * (n - m), n - m).divide((m + 1L) * (n - m) + 1) : Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}


package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394648 Rectangular array, read by descending antidiagonals: the offset sum array of the Thue-Morse sequence, A010060; see Comments.
 * @author Sean A. Irvine
 */
public class A394648 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Z.valueOf(Functions.THUE_MORSE.l(n) + Functions.THUE_MORSE.l(n + m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}


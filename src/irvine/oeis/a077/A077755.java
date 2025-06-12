package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a075.A075397;

/**
 * A077755 Array in which the n-th row contains the multiples of n using nonzero digits and having a digit sum of n. Sequence contains the rows and a zero entry for rows with no terms (e.g. 10).
 * @author Sean A. Irvine
 */
public class A077755 extends Sequence1 {

  private final Sequence mRowLengths = new A075397();
  private long mN = 0;
  private long mK = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mK <= 0) {
      ++mN;
      mM = 0;
      mK = mRowLengths.next().longValueExact();
    }
    while (true) {
      mM += mN;
      if ((Functions.SYNDROME.i(mM) & 1) == 0 && Functions.DIGIT_SUM.l(mM) == mN) {
        return Z.valueOf(mM);
      }
    }
  }
}


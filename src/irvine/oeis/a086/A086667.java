package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A086667 Triangular array, read by rows: T(n,k) = greatest decimal number of length k contained as a string in the first n positions of the decimal expansion of Pi, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A086667 extends Sequence1 {

  private final Sequence mPi = new A000796();
  private final StringBuilder mS = new StringBuilder();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mS.append(mPi.next());
    }
    String best = mS.substring(0, mM);
    for (int k = 1; k <= mS.length() - mM; ++k) {
      final String t = mS.substring(k, k + mM);
      if (t.compareTo(best) > 0) {
        best = t;
      }
    }
    return new Z(best);
  }
}

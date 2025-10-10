package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a036.A036039;
import irvine.oeis.a036.A036040;

/**
 * A107106 Irregular triangle T(n,k) = A036039(n,k) / A036040(n,k), read by rows, 1 &lt;= k &lt;= A000041(n).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A107106 extends Sequence1 {

  private final A036039 mSeq1 = new A036039();
  private final A036040 mSeq2 = new A036040();
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return mSeq1.next().divide(mSeq2.next());
  }
}

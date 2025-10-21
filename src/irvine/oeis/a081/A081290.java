package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000108;

/**
 * A081290 a(0) = 0, and for n &gt;=1, a(n) = the largest Catalan number &lt;= n.
 * @author Sean A. Irvine
 */
public class A081290 extends Sequence0 {

  private final Sequence mCatalan = new A000108();
  private Z mC = mCatalan.next();
  private long mN = -1;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    while (mC.compareTo(mN) <= 0) {
      mM = mC;
      mC = mCatalan.next();
    }
    return mM;
  }
}


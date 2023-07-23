package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a013.A013929;

/**
 * A062322 Factorials of nonsquarefree numbers, or A013929(n)!, (including 1).
 * @author Sean A. Irvine
 */
public class A062322 extends AbstractSequence {

  private final A013929 mSeq1 = new A013929();

  /** Construct the sequence. */
  public A062322() {
    super(0);
  }

  private Z mF = null;
  private long mN = 2;

  @Override
  public Z next() {
    if (mF == null) {
      mF = Z.ONE;
      return Z.ONE;
    }
    final long t = mSeq1.next().longValueExact();
    while (mN <= t) {
      mF = mF.multiply(mN);
      ++mN;
    }
    return mF;
  }
}

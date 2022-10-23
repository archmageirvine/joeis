package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a020.A020669;

/**
 * A054150 Number of positive integers &lt;= 2^n of the form x^2 + 5*y^2.
 * @author Sean A. Irvine
 */
public class A054150 extends Sequence0 {

  private Z mT = null;
  private long mCnt = -1; // to account for 0
  private final Sequence mSeq;
  private Z mA;

  protected A054150(final Sequence seq) {
    mSeq = seq;
    mA = mSeq.next();
  }

  /** Construct the sequence. */
  public A054150() {
    this(new A020669());
  }

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply2();
    while (mA.compareTo(mT) <= 0) {
      ++mCnt;
      mA = mSeq.next();
    }
    return Z.valueOf(mCnt);
  }
}

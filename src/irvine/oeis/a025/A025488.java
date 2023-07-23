package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025488 Number of distinct prime signatures of the positive integers up to 2^n.
 * @author Sean A. Irvine
 */
public class A025488 extends AbstractSequence {

  private final A025487 mSeq1 = new A025487();

  /** Construct the sequence. */
  public A025488() {
    super(0);
  }

  private long mSignatures = 0;
  private Z mLimit = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mSignatures;
    } while (mSeq1.next().compareTo(mLimit) < 0);
    mLimit = mLimit.multiply2();
    return Z.valueOf(mSignatures);
  }
}


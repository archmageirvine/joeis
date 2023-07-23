package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048982 Number of numbers which have a "prime-rich" reduced residue system (RRS) and binary order n.
 * @author Sean A. Irvine
 */
public class A048982 extends AbstractSequence {

  private final A048868 mSeq1 = new A048868();

  /** Construct the sequence. */
  public A048982() {
    super(0);
  }

  private Z mA = mSeq1.next();
  private Z mUpper = Z.ONE;

  @Override
  public Z next() {
    long cnt = 0;
    while (mA.compareTo(mUpper) <= 0) {
      ++cnt;
      mA = mSeq1.next();
    }
    mUpper = mUpper.multiply2();
    return Z.valueOf(cnt);
  }
}


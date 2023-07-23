package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001563;

/**
 * A002468 The game of Mousetrap with n cards: the number of permutations of n cards having at least one hit after 2.
 * @author Sean A. Irvine
 */
public class A002468 extends AbstractSequence {

  private final A002469 mSeq1 = new A002469();

  /** Construct the sequence. */
  public A002468() {
    super(1);
  }

  private final A001563 mA1563 = new A001563();
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return mA1563.next().subtract(mSeq1.next());
  }

}

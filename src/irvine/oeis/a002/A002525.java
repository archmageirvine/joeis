package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;

/**
 * A002525 Number of permutations according to distance.
 * @author Sean A. Irvine
 */
public class A002525 extends PartialSumSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A002525() {
    super(new A002524());
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next();
  }
}

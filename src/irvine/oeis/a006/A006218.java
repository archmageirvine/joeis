package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000005;

/**
 * A006218.
 * @author Sean A. Irvine
 */
public class A006218 extends PartialSumSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A006218() {
    super(new A000005());
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

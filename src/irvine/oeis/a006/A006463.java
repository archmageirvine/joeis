package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a003.A003056;

/**
 * A006463.
 * @author Sean A. Irvine
 */
public class A006463 extends PartialSumSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A006463() {
    super(new A003056());
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

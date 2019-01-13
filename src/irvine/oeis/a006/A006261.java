package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000127;

/**
 * A006261.
 * @author Sean A. Irvine
 */
public class A006261 extends PartialSumSequence {

  /** Construct the sequence. */
  public A006261() {
    super(new A000127());
    mSum = Z.ONE;
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next();
  }
}


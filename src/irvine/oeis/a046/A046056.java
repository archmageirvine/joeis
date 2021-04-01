package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.PositionOfNSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000688;
import irvine.oeis.a033.A033637;

/**
 * A046056 Smallest order for which there are n nonisomorphic finite Abelian groups, or 0 if no such order exists.
 * @author Sean A. Irvine
 */
public class A046056 extends PositionOfNSequence {

  private final Sequence mProductPartions = new A033637();
  private long mPP = mProductPartions.next().longValueExact();

  /** Construct the sequence. */
  public A046056() {
    super(new A000688(), 1);
  }

  @Override
  public Z next() {
    if (mN + 1 != mPP) {
      // There is no solution -- sneakily update mN under and return 0
      ++mN;
      return Z.ZERO;
    }
    mPP = mProductPartions.next().longValueExact();
    return super.next();
  }
}

package irvine.oeis.a318;
// manually at 2025-06-18

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a040.A040996;

/**
 * A318129 Number of sets of nonempty subsets of {1,...,n} with intersection {}.
 * @author Georg Fischer
 */
public class A318129 extends AbstractSequence {

  private final A040996 mSeq1 = new A040996();
  private final A318130 mSeq2 = new A318130();
  ;
  private int mN;

  /** Construct the sequence. */
  public A318129() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mSeq2.next();
      return Z.ONE;
    }
    return mSeq2.next().subtract(Z.TWO.pow(Z.TWO.pow(mN).subtract(1)));
  }
}

package irvine.oeis.a071;
// manually andiv 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006939;

/**
 * A071627 Terms of Chernoff sequence A006939 divided by (n + 1)!.
 * @author Georg Fischer
 */
public class A071627 extends AbstractSequence {

  private final A006939 mSeq1 = new A006939();
  private int mN;

  /** Construct the sequence. */
  public A071627() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().divide(Functions.FACTORIAL.z(mN + 1));
  }
}

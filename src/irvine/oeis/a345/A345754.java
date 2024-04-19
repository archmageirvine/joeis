package irvine.oeis.a345;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a344.A344372;

/**
 * A345754 Number of 2 X 2 matrices over Z_n whose permanent equals their determinant.
 * @author Georg Fischer
 */
public class A345754 extends AbstractSequence {

  private final A344372 mSeq1 = new A344372();
  private long mN;

  /** Construct the sequence. */
  public A345754() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().multiply(mN * mN);
  }
}

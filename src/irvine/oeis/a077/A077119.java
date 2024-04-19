package irvine.oeis.a077;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A077119 a(n) = A077118(n) - n^3.
 * @author Georg Fischer
 */
public class A077119 extends AbstractSequence {

  private final A077118 mSeq1 = new A077118();
  private long mN;

  /** Construct the sequence. */
  public A077119() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().subtract(Z.valueOf(mN).multiply(mN * mN));
  }
}

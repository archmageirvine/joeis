package irvine.oeis.a294;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000110;

/**
 * A294431 Rank of the inverse semigroup D_n of all difunctional relations on an n-element set.
 * @author Georg Fischer
 */
public class A294431 extends AbstractSequence {

  private A000110 mSeq1 = new A000110();
  private long mN;

  /** Construct the sequence. */
  public A294431() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().add(mN);
    return (mN == 2) ? Z.THREE : result;
  }
}

package irvine.oeis.a067;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001157;

/**
 * A067558 Sum of squares of proper divisors of n.
 * @author Georg Fischer
 */
public class A067558 extends AbstractSequence {

  private A001157 mSeq1 = new A001157();
  private long mN;

  /** Construct the sequence. */
  public A067558() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().subtract(mN * mN);
  }
}

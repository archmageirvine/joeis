package irvine.oeis.a277;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a052.A052489;

/**
 * A277223 a(n) = A052489(n)/n.
 * @author Georg Fischer
 */
public class A277223 extends AbstractSequence {

  private A052489 mSeq1 = new A052489();
  private long mN;

  /** Construct the sequence. */
  public A277223() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(++mN);
  }
}

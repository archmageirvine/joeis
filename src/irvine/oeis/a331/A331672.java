package irvine.oeis.a331;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023037;
import irvine.oeis.a048.A048775;

/**
 * A331672 Sum of all base-n numbers with digit sum n and length at most n.
 * @author Georg Fischer
 */
public class A331672 extends AbstractSequence {

  private A048775 mSeq1 = new A048775();
  private A023037 mSeq2 = new A023037();

  /** Construct the sequence. */
  public A331672() {
    super(2);
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}

package irvine.oeis.a131;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002998;

/**
 * A131382 Minimal number m such that Sum_digits(n*m)=n.
 * @author Georg Fischer
 */
public class A131382 extends AbstractSequence {

  private final A002998 mSeq1 = new A002998();
  private long mN;

  /** Construct the sequence. */
  public A131382() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(++mN);
  }
}

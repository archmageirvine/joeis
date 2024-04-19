package irvine.oeis.a108;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a060.A060356;

/**
 * A108919 Number of series-reduced labeled trees with n nodes.
 * @author Georg Fischer
 */
public class A108919 extends AbstractSequence {

  private final A060356 mSeq1 = new A060356();
  private long mN;

  /** Construct the sequence. */
  public A108919() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(++mN);
  }
}

package irvine.oeis.a138;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002865;

/**
 * A138880 Sum of all parts of all partitions of n that do not contain 1 as a part.
 * @author Georg Fischer
 */
public class A138880 extends AbstractSequence {

  private A002865 mSeq1 = new A002865();
  private long mN;

  /** Construct the sequence. */
  public A138880() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(++mN);
  }
}

package irvine.oeis.a086;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000088;

/**
 * A086314 Total number of edges in the distinct simple graphs on n nodes.
 * @author Georg Fischer
 */
public class A086314 extends AbstractSequence {

  private final A000088 mSeq1 = new A000088();
  private long mN;

  /** Construct the sequence. */
  public A086314() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    // a(n) = A000088(n)*n(n-1)/4
    ++mN;
    return mSeq1.next().multiply(mN * (mN - 1)).divide(4);
  }
}

package irvine.oeis.a199;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000273;

/**
 * A199012 The total number of edges in all unlabeled directed graphs (no self loops allowed) on n nodes.
 * @author Georg Fischer
 */
public class A199012 extends AbstractSequence {

  private A000273 mSeq1 = new A000273();
  private long mN;

  /** Construct the sequence. */
  public A199012() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    // a(n) = A000273(n) * n(n-1)/2.
    ++mN;
    return mSeq1.next().multiply(mN * (mN - 1) / 2);
  }
}

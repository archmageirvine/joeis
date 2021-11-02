package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.triangle.Triangle;

/**
 * A143267 Triangle read by rows, A130207 * A000012 * A127648.
 * @author Georg Fischer
 */
public class A143267 extends Triangle {

  protected Sequence mSeq;
  
  /** Construct the sequence. */
  public A143267() {
    mSeq = new A000010();
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? mSeq.next() : get(n, 0).multiply(k + 1);
  }
}

package irvine.oeis.a192;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000125;
import irvine.oeis.triangle.Triangle;

/**
 * A192915 Triangle read by rows: T(n,k) = Sum_{j=0..3} binomial(n+3, k+j), 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A192915 extends Triangle {

  private Sequence mSeq;
  private Z mT125;

  /** Construct the sequence. */
  public A192915() {
    mSeq = new A000125();
    mSeq.next();
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z compute(final int n, final int k) {
    if (k == 0) {
      mT125 = mSeq.next();
      return mT125;
    } else if (k == n) {
      return mT125;
    } else {
      return get(n - 1, k - 1).add(get(n - 1, k));
    }
  }
}

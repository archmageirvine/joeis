package irvine.oeis.a116;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a027.A027336;
import irvine.oeis.triangle.DoubleRowTriangle;

/**
 * A116599 Triangle read by rows: T(n,k) is the number of partitions of n having exactly k parts equal to 2 (n&gt;=0, 0&lt;=k&lt;=floor(n/2)).
 * @author Georg Fischer
 */
public class A116599 extends DoubleRowTriangle {

  private Sequence mSeq = new A027336();

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? mSeq.next() : get(n - 2, k - 1);
  }
}

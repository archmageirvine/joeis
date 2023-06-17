package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A043000 Number of digits in all base-b representations of n, for 2 &lt;= b &lt;= n.
 * @author Sean A. Irvine
 */
public class A043000 extends AbstractSequence {

  /* Construct the sequence. */
  public A043000() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final Z n = Z.valueOf(++mN);
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(n.root(k));
    }
    return sum;
  }
}

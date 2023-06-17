package irvine.oeis.a047;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A047098 a(n) = 2*binomial(3*n, n) - Sum_{k=0..n} binomial(3*n, k).
 * @author Sean A. Irvine
 */
public class A047098 extends AbstractSequence {

  /* Construct the sequence. */
  public A047098() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Binomial.binomial(3 * ++mN, mN).multiply2();
    for (long k = 0; k <= mN; ++k) {
      sum = sum.subtract(Binomial.binomial(3 * mN, k));
    }
    return sum;
  }
}

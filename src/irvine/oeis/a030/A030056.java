package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A030056 a(n) = binomial(2*n+1, n-6).
 * @author Sean A. Irvine
 */
public class A030056 extends AbstractSequence {

  /** Construct the sequence. */
  public A030056() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN + 1, mN - 6);
  }
}

package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A030055 a(n) = binomial(2*n+1, n-5).
 * @author Sean A. Irvine
 */
public class A030055 extends AbstractSequence {

  /* Construct the sequence. */
  public A030055() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN + 1, mN - 5);
  }
}

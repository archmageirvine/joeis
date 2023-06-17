package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004378 Binomial coefficient C(7n,n-10).
 * @author Sean A. Irvine
 */
public class A004378 extends AbstractSequence {

  /* Construct the sequence. */
  public A004378() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 10);
  }
}


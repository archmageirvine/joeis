package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004375 Binomial coefficient C(7n,n-7).
 * @author Sean A. Irvine
 */
public class A004375 extends AbstractSequence {

  /* Construct the sequence. */
  public A004375() {
    super(7);
  }

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 7);
  }
}


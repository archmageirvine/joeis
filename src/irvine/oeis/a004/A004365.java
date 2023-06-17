package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004365 Binomial coefficient C(6n,n-10).
 * @author Sean A. Irvine
 */
public class A004365 extends AbstractSequence {

  /* Construct the sequence. */
  public A004365() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 10);
  }
}


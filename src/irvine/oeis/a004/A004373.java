package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004373 Binomial coefficient C(7n,n-5).
 * @author Sean A. Irvine
 */
public class A004373 extends AbstractSequence {

  /** Construct the sequence. */
  public A004373() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 5);
  }
}


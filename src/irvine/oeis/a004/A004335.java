package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004335 Binomial coefficient C(4n,n-5).
 * @author Sean A. Irvine
 */
public class A004335 extends AbstractSequence {

  /** Construct the sequence. */
  public A004335() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 5);
  }
}


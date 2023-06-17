package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004312 Binomial coefficient C(2n,n-6).
 * @author Sean A. Irvine
 */
public class A004312 extends AbstractSequence {

  /** Construct the sequence. */
  public A004312() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 6);
  }
}


package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004372 Binomial coefficient C(7n,n-4).
 * @author Sean A. Irvine
 */
public class A004372 extends AbstractSequence {

  /** Construct the sequence. */
  public A004372() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 4);
  }
}


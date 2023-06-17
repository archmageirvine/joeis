package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004374 Binomial coefficient C(7n,n-6).
 * @author Sean A. Irvine
 */
public class A004374 extends AbstractSequence {

  /** Construct the sequence. */
  public A004374() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 6);
  }
}


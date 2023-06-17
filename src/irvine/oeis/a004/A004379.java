package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004379 Binomial coefficient C(7n,n-11).
 * @author Sean A. Irvine
 */
public class A004379 extends AbstractSequence {

  /** Construct the sequence. */
  public A004379() {
    super(11);
  }

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 11);
  }
}


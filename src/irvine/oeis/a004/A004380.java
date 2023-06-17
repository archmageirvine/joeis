package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004380 Binomial coefficient C(7n,n-12).
 * @author Sean A. Irvine
 */
public class A004380 extends AbstractSequence {

  /** Construct the sequence. */
  public A004380() {
    super(12);
  }

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 12);
  }
}


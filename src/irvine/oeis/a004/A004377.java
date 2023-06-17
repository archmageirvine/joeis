package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004377 Binomial coefficient C(7n,n-9).
 * @author Sean A. Irvine
 */
public class A004377 extends AbstractSequence {

  /** Construct the sequence. */
  public A004377() {
    super(9);
  }

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 9);
  }
}


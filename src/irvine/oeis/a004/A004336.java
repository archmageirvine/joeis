package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004336 Binomial coefficient C(4n,n-6).
 * @author Sean A. Irvine
 */
public class A004336 extends AbstractSequence {

  /** Construct the sequence. */
  public A004336() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 6);
  }
}


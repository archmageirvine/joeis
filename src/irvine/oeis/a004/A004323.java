package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004323 Binomial coefficient C(3n,n-5).
 * @author Sean A. Irvine
 */
public class A004323 extends AbstractSequence {

  /** Construct the sequence. */
  public A004323() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 5);
  }
}


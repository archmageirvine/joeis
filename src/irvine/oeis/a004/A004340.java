package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004340 Binomial coefficient C(4n,n-10).
 * @author Sean A. Irvine
 */
public class A004340 extends AbstractSequence {

  /** Construct the sequence. */
  public A004340() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 10);
  }
}


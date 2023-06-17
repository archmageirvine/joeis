package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004324 Binomial coefficient C(3n,n-6).
 * @author Sean A. Irvine
 */
public class A004324 extends AbstractSequence {

  /** Construct the sequence. */
  public A004324() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 6);
  }
}


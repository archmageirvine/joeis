package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004318 Binomial coefficient C(2n,n-12).
 * @author Sean A. Irvine
 */
public class A004318 extends AbstractSequence {

  /** Construct the sequence. */
  public A004318() {
    super(12);
  }

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 12);
  }
}


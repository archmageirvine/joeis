package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004367 Binomial coefficient C(6n,n-12).
 * @author Sean A. Irvine
 */
public class A004367 extends AbstractSequence {

  /* Construct the sequence. */
  public A004367() {
    super(12);
  }

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 12);
  }
}


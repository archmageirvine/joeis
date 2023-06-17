package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004327 Binomial coefficient C(3n,n-9).
 * @author Sean A. Irvine
 */
public class A004327 extends AbstractSequence {

  /* Construct the sequence. */
  public A004327() {
    super(9);
  }

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 9);
  }
}


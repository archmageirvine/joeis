package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004351 Binomial coefficient C(5*n,n-9).
 * @author Sean A. Irvine
 */
public class A004351 extends AbstractSequence {

  /* Construct the sequence. */
  public A004351() {
    super(9);
  }

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 9);
  }
}


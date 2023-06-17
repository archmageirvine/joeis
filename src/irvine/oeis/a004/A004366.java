package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004366 Binomial coefficient C(6n,n-11).
 * @author Sean A. Irvine
 */
public class A004366 extends AbstractSequence {

  /* Construct the sequence. */
  public A004366() {
    super(11);
  }

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(6 * ++mN, mN - 11);
  }
}


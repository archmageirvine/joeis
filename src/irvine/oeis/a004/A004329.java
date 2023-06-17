package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004329 Binomial coefficient C(3n,n-11).
 * @author Sean A. Irvine
 */
public class A004329 extends AbstractSequence {

  /* Construct the sequence. */
  public A004329() {
    super(11);
  }

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 11);
  }
}


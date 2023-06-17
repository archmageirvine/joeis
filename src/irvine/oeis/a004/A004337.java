package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004337 Binomial coefficient C(4n,n-7).
 * @author Sean A. Irvine
 */
public class A004337 extends AbstractSequence {

  /* Construct the sequence. */
  public A004337() {
    super(7);
  }

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 7);
  }
}


package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004342 Binomial coefficient C(4n, n-12).
 * @author Sean A. Irvine
 */
public class A004342 extends AbstractSequence {

  /* Construct the sequence. */
  public A004342() {
    super(12);
  }

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 12);
  }
}


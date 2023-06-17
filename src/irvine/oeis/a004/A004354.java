package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004354 Binomial coefficient C(5n, n-12).
 * @author Sean A. Irvine
 */
public class A004354 extends AbstractSequence {

  /* Construct the sequence. */
  public A004354() {
    super(12);
  }

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 12);
  }
}


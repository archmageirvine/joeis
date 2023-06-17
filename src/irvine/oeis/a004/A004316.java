package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004316 a(n) = binomial coefficient C(2n, n-10).
 * @author Sean A. Irvine
 */
public class A004316 extends AbstractSequence {

  /** Construct the sequence. */
  public A004316() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 10);
  }
}


package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004314 a(n) = binomial coefficient C(2n, n - 8).
 * @author Sean A. Irvine
 */
public class A004314 extends AbstractSequence {

  /** Construct the sequence. */
  public A004314() {
    super(8);
  }

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 8);
  }
}


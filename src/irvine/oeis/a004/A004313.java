package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004313 a(n) = binomial coefficient C(2n, n-7).
 * @author Sean A. Irvine
 */
public class A004313 extends AbstractSequence {

  /** Construct the sequence. */
  public A004313() {
    super(7);
  }

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 7);
  }
}


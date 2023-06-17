package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004348 Binomial coefficient C(5n, n-6).
 * @author Sean A. Irvine
 */
public class A004348 extends AbstractSequence {

  /** Construct the sequence. */
  public A004348() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(5 * ++mN, mN - 6);
  }
}


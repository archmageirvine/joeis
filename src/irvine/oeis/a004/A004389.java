package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004389 a(n) = binomial(8*n, n-8).
 * @author Sean A. Irvine
 */
public class A004389 extends AbstractSequence {

  /** Construct the sequence. */
  public A004389() {
    super(8);
  }

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN - 8);
  }
}


package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004338 Binomial coefficient C(4n,n-8).
 * @author Sean A. Irvine
 */
public class A004338 extends AbstractSequence {

  /** Construct the sequence. */
  public A004338() {
    super(8);
  }

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN - 8);
  }
}


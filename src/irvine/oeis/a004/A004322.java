package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004322 Binomial coefficient C(3n,n-4).
 * @author Sean A. Irvine
 */
public class A004322 extends AbstractSequence {

  /** Construct the sequence. */
  public A004322() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN - 4);
  }
}


package irvine.oeis.a004;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004376 Binomial coefficient C(7n,n-8).
 * @author Sean A. Irvine
 */
public class A004376 extends AbstractSequence {

  /** Construct the sequence. */
  public A004376() {
    super(8);
  }

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(7 * ++mN, mN - 8);
  }
}


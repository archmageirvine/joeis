package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010989 Binomial coefficient C(n,36).
 * @author Sean A. Irvine
 */
public class A010989 extends AbstractSequence {

  /** Construct the sequence. */
  public A010989() {
    super(36);
  }

  private long mN = 35;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 36);
  }
}


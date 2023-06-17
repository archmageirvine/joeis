package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010990 Binomial coefficient C(n,37).
 * @author Sean A. Irvine
 */
public class A010990 extends AbstractSequence {

  /** Construct the sequence. */
  public A010990() {
    super(37);
  }

  private long mN = 36;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 37);
  }
}


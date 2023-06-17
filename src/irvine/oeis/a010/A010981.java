package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010981 Binomial coefficient C(n,28).
 * @author Sean A. Irvine
 */
public class A010981 extends AbstractSequence {

  /** Construct the sequence. */
  public A010981() {
    super(28);
  }

  private long mN = 27;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 28);
  }
}


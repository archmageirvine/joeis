package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010977 a(n) = binomial coefficient C(n,24).
 * @author Sean A. Irvine
 */
public class A010977 extends AbstractSequence {

  /** Construct the sequence. */
  public A010977() {
    super(24);
  }

  private long mN = 23;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 24);
  }
}


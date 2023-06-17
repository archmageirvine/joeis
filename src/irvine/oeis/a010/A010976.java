package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010976 Binomial coefficient C(n, 23).
 * @author Sean A. Irvine
 */
public class A010976 extends AbstractSequence {

  /** Construct the sequence. */
  public A010976() {
    super(23);
  }

  private long mN = 22;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 23);
  }
}


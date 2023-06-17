package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010993 Binomial coefficient C(n,40).
 * @author Sean A. Irvine
 */
public class A010993 extends AbstractSequence {

  /** Construct the sequence. */
  public A010993() {
    super(40);
  }

  private long mN = 39;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 40);
  }
}


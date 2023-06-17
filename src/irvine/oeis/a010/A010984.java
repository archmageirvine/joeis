package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010984 Binomial coefficient C(n,31).
 * @author Sean A. Irvine
 */
public class A010984 extends AbstractSequence {

  /** Construct the sequence. */
  public A010984() {
    super(31);
  }

  private long mN = 30;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 31);
  }
}


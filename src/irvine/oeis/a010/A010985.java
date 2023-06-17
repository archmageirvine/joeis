package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010985 Binomial coefficient C(n, 32).
 * @author Sean A. Irvine
 */
public class A010985 extends AbstractSequence {

  /** Construct the sequence. */
  public A010985() {
    super(32);
  }

  private long mN = 31;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 32);
  }
}


package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010982 Binomial coefficient C(n, 29).
 * @author Sean A. Irvine
 */
public class A010982 extends AbstractSequence {

  /** Construct the sequence. */
  public A010982() {
    super(29);
  }

  private long mN = 28;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 29);
  }
}


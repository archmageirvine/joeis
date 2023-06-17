package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010996 Binomial coefficient C(n,43).
 * @author Sean A. Irvine
 */
public class A010996 extends AbstractSequence {

  /** Construct the sequence. */
  public A010996() {
    super(43);
  }

  private long mN = 42;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 43);
  }
}


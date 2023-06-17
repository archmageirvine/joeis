package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010986 Binomial coefficient C(n, 33).
 * @author Sean A. Irvine
 */
public class A010986 extends AbstractSequence {

  /** Construct the sequence. */
  public A010986() {
    super(33);
  }

  private long mN = 32;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 33);
  }
}


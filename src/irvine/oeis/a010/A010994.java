package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010994 a(n) = binomial coefficient C(n, 41).
 * @author Sean A. Irvine
 */
public class A010994 extends AbstractSequence {

  /** Construct the sequence. */
  public A010994() {
    super(41);
  }

  private long mN = 40;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 41);
  }
}


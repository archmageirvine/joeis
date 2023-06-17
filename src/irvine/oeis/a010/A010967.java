package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010967 a(n) = binomial coefficient C(n,14).
 * @author Sean A. Irvine
 */
public class A010967 extends AbstractSequence {

  /** Construct the sequence. */
  public A010967() {
    super(14);
  }

  private long mN = 13;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 14);
  }
}


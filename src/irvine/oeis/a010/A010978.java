package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010978 a(n) = binomial(n, 25).
 * @author Sean A. Irvine
 */
public class A010978 extends AbstractSequence {

  /* Construct the sequence. */
  public A010978() {
    super(25);
  }

  private long mN = 24;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 25);
  }
}


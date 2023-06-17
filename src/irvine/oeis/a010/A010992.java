package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010992 Binomial coefficient C(n, 39).
 * @author Sean A. Irvine
 */
public class A010992 extends AbstractSequence {

  /* Construct the sequence. */
  public A010992() {
    super(39);
  }

  private long mN = 38;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 39);
  }
}


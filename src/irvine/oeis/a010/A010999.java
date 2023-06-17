package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010999 a(n) = binomial coefficient C(n, 46).
 * @author Sean A. Irvine
 */
public class A010999 extends AbstractSequence {

  /* Construct the sequence. */
  public A010999() {
    super(46);
  }

  private long mN = 45;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 46);
  }
}


package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010971 a(n) = binomial(n, 18).
 * @author Sean A. Irvine
 */
public class A010971 extends AbstractSequence {

  /* Construct the sequence. */
  public A010971() {
    super(18);
  }

  private long mN = 17;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 18);
  }
}


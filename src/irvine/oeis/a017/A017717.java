package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017717 Binomial coefficients C(n, 53).
 * @author Sean A. Irvine
 */
public class A017717 extends AbstractSequence {

  /* Construct the sequence. */
  public A017717() {
    super(53);
  }

  private long mN = 52;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 53);
  }
}


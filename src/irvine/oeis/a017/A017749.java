package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017749 Binomial coefficients C(n, 85).
 * @author Sean A. Irvine
 */
public class A017749 extends AbstractSequence {

  /* Construct the sequence. */
  public A017749() {
    super(85);
  }

  private long mN = 84;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 85);
  }
}


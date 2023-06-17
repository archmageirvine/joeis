package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017759 Binomial coefficients C(n, 95).
 * @author Sean A. Irvine
 */
public class A017759 extends AbstractSequence {

  /* Construct the sequence. */
  public A017759() {
    super(95);
  }

  private long mN = 94;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 95);
  }
}


package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017745 Binomial coefficients C(n, 81).
 * @author Sean A. Irvine
 */
public class A017745 extends AbstractSequence {

  /* Construct the sequence. */
  public A017745() {
    super(81);
  }

  private long mN = 80;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 81);
  }
}


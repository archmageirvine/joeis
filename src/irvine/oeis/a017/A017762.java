package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017762 Binomial coefficients C(n,98).
 * @author Sean A. Irvine
 */
public class A017762 extends AbstractSequence {

  /** Construct the sequence. */
  public A017762() {
    super(98);
  }

  private long mN = 97;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 98);
  }
}


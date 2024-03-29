package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017755 Binomial coefficients C(n,91).
 * @author Sean A. Irvine
 */
public class A017755 extends AbstractSequence {

  /** Construct the sequence. */
  public A017755() {
    super(91);
  }

  private long mN = 90;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 91);
  }
}


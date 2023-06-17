package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017751 Binomial coefficients C(n,87).
 * @author Sean A. Irvine
 */
public class A017751 extends AbstractSequence {

  /** Construct the sequence. */
  public A017751() {
    super(87);
  }

  private long mN = 86;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 87);
  }
}


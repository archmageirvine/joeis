package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017729 Binomial coefficients C(n, 65).
 * @author Sean A. Irvine
 */
public class A017729 extends AbstractSequence {

  /** Construct the sequence. */
  public A017729() {
    super(65);
  }

  private long mN = 64;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 65);
  }
}


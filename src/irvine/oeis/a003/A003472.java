package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003472 a(n) = 2^(n-4)*C(n, 4).
 * @author Sean A. Irvine
 */
public class A003472 extends AbstractSequence {

  /** Construct the sequence. */
  public A003472() {
    super(4);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 4, 4).shiftLeft(mN);
  }
}


package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000332 Binomial coefficient binomial(n, 4) = n*(n-1)*(n-2)*(n-3)/24.
 * @author Sean A. Irvine
 */
public class A000332 extends AbstractSequence {

  /* Construct the sequence. */
  public A000332() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN < 4 ? Z.ZERO : Binomial.binomial(mN, 4);
  }
}


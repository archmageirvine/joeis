package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A051924 a(n) = binomial(2*n,n) - binomial(2*n-2,n-1); or (3n-2)*C(n-1), where C = Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A051924 extends AbstractSequence {

  /** Construct the sequence. */
  public A051924() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).subtract(Binomial.binomial(2 * mN - 2, mN - 1));
  }
}

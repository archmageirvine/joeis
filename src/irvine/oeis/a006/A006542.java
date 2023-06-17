package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006542 a(n) = binomial(n, 3)*binomial(n-1, 3)/4.
 * @author Sean A. Irvine
 */
public class A006542 extends AbstractSequence {

  /* Construct the sequence. */
  public A006542() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 3).multiply(Binomial.binomial(mN - 1, 3)).divide(4);
  }
}

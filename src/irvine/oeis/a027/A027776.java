package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027776 a(n) = (n+1)*binomial(n+1, 16).
 * @author Sean A. Irvine
 */
public class A027776 extends AbstractSequence {

  /* Construct the sequence. */
  public A027776() {
    super(15);
  }

  private long mN = 15;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 16).multiply(mN);
  }
}

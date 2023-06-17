package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027822 a(n) = 42*(n+1)*binomial(n+6, 10).
 * @author Sean A. Irvine
 */
public class A027822 extends AbstractSequence {

  /* Construct the sequence. */
  public A027822() {
    super(4);
  }

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 5, 10).multiply(42 * mN);
  }
}

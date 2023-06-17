package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027815 a(n) = 42*(n+1) * binomial(n+5,10).
 * @author Sean A. Irvine
 */
public class A027815 extends AbstractSequence {

  /** Construct the sequence. */
  public A027815() {
    super(5);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 4, 10).multiply(42 * mN);
  }
}

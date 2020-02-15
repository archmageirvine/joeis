package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027815 <code>a(n) = 42*(n+1) * binomial(n+5,10)</code>.
 * @author Sean A. Irvine
 */
public class A027815 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 4, 10).multiply(42 * mN);
  }
}

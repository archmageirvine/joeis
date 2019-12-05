package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027817 <code>99*(n+1)*C(n+5,12)</code>.
 * @author Sean A. Irvine
 */
public class A027817 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 4, 12).multiply(99 * mN);
  }
}

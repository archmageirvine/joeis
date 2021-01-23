package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027806 30*(n+1)*C(n+4,10).
 * @author Sean A. Irvine
 */
public class A027806 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 3, 10).multiply(30 * mN);
  }
}

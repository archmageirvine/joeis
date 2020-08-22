package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027776 (n+1)*C(n+1,16).
 * @author Sean A. Irvine
 */
public class A027776 implements Sequence {

  private long mN = 15;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 16).multiply(mN);
  }
}

package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011851 a(n) = floor(binomial(n,5)/5).
 * @author Sean A. Irvine
 */
public class A011851 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 5).divide(5);
  }
}

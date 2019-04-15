package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011850 <code>a(n) = floor(binomial(n,4)/4)</code>.
 * @author Sean A. Irvine
 */
public class A011850 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 4).divide(4);
  }
}

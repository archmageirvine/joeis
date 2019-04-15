package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011797 <code>a(n) = floor(C(n,6)/7)</code>.
 * @author Sean A. Irvine
 */
public class A011797 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6).divide(7);
  }
}

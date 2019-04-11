package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011849 <code>a(n) =</code> floor(binomial(n,3)/3).
 * @author Sean A. Irvine
 */
public class A011849 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 3).divide(3);
  }
}

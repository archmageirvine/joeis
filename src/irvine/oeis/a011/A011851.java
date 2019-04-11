package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011851 <code>a(n) =</code> floor(binomial(n,5)/5).
 * @author Sean A. Irvine
 */
public class A011851 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 5).divide(5);
  }
}

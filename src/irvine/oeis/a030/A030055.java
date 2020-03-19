package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030055 <code>a(n) = binomial(2*n+1, n-5)</code>.
 * @author Sean A. Irvine
 */
public class A030055 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN + 1, mN - 5);
  }
}

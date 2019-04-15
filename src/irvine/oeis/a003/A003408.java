package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003408 <code>a(n) = binomial(3n+6, n)</code>.
 * @author Sean A. Irvine
 */
public class A003408 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN + 6, mN);
  }
}

package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003472 <code>a(n) =</code> 2^(n-4)*C(n,4).
 * @author Sean A. Irvine
 */
public class A003472 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 4, 4).shiftLeft(mN);
  }
}


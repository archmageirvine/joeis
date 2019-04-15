package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000389 Binomial coefficients <code>C(n,5)</code>.
 * @author Sean A. Irvine
 */
public class A000389 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 5);
  }
}

package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001287 Binomial coefficients <code>C(n,10)</code>.
 * @author Sean A. Irvine
 */
public class A001287 implements Sequence {

  private long mN = 9;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 10);
  }
}

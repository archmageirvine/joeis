package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017720 Binomial coefficients <code>C(n,56)</code>.
 * @author Sean A. Irvine
 */
public class A017720 implements Sequence {

  private long mN = 55;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 56);
  }
}


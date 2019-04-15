package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017731 Binomial coefficients <code>C(n,67)</code>.
 * @author Sean A. Irvine
 */
public class A017731 implements Sequence {

  private long mN = 66;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 67);
  }
}


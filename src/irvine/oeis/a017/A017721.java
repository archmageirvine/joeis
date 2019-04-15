package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017721 Binomial coefficients <code>C(n,57)</code>.
 * @author Sean A. Irvine
 */
public class A017721 implements Sequence {

  private long mN = 56;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 57);
  }
}


package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017738 Binomial coefficients C(n,74).
 * @author Sean A. Irvine
 */
public class A017738 implements Sequence {

  private long mN = 73;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 74);
  }
}


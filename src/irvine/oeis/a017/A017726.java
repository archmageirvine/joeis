package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017726 Binomial coefficients C(n,62).
 * @author Sean A. Irvine
 */
public class A017726 implements Sequence {

  private long mN = 61;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 62);
  }
}


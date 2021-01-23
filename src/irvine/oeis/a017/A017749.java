package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017749 Binomial coefficients C(n,85).
 * @author Sean A. Irvine
 */
public class A017749 implements Sequence {

  private long mN = 84;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 85);
  }
}


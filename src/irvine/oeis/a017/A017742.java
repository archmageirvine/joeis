package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017742 Binomial coefficients C(n,78).
 * @author Sean A. Irvine
 */
public class A017742 implements Sequence {

  private long mN = 77;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 78);
  }
}


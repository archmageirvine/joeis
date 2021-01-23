package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017728 Binomial coefficients C(n,64).
 * @author Sean A. Irvine
 */
public class A017728 implements Sequence {

  private long mN = 63;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 64);
  }
}


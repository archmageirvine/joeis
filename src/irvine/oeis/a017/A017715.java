package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017715 Binomial coefficients C(n,51).
 * @author Sean A. Irvine
 */
public class A017715 implements Sequence {

  private long mN = 50;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 51);
  }
}


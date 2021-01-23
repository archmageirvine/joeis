package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017741 Binomial coefficients C(n,77).
 * @author Sean A. Irvine
 */
public class A017741 implements Sequence {

  private long mN = 76;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 77);
  }
}


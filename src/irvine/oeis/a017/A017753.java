package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017753 Binomial coefficients C(n,89).
 * @author Sean A. Irvine
 */
public class A017753 implements Sequence {

  private long mN = 88;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 89);
  }
}


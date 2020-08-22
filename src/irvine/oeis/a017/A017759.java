package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017759 Binomial coefficients C(n,95).
 * @author Sean A. Irvine
 */
public class A017759 implements Sequence {

  private long mN = 94;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 95);
  }
}


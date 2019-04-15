package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017758 Binomial coefficients <code>C(n,94)</code>.
 * @author Sean A. Irvine
 */
public class A017758 implements Sequence {

  private long mN = 93;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 94);
  }
}


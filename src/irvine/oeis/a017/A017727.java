package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017727 Binomial coefficients <code>C(n,63)</code>.
 * @author Sean A. Irvine
 */
public class A017727 implements Sequence {

  private long mN = 62;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 63);
  }
}


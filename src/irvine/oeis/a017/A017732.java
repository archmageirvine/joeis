package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017732 Binomial coefficients <code>C(n,68)</code>.
 * @author Sean A. Irvine
 */
public class A017732 implements Sequence {

  private long mN = 67;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 68);
  }
}


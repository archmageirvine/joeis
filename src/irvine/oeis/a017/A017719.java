package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017719 Binomial coefficients <code>C(n,55)</code>.
 * @author Sean A. Irvine
 */
public class A017719 implements Sequence {

  private long mN = 54;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 55);
  }
}


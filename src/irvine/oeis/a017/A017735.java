package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017735 Binomial coefficients <code>C(n,71)</code>.
 * @author Sean A. Irvine
 */
public class A017735 implements Sequence {

  private long mN = 70;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 71);
  }
}


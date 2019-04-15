package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017744 Binomial coefficients <code>C(n,80)</code>.
 * @author Sean A. Irvine
 */
public class A017744 implements Sequence {

  private long mN = 79;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 80);
  }
}


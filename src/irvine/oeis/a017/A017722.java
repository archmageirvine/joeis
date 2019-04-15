package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017722 Binomial coefficients <code>C(n,58)</code>.
 * @author Sean A. Irvine
 */
public class A017722 implements Sequence {

  private long mN = 57;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 58);
  }
}


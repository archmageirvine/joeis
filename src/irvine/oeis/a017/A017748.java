package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017748 Binomial coefficients <code>C(n,84)</code>.
 * @author Sean A. Irvine
 */
public class A017748 implements Sequence {

  private long mN = 83;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 84);
  }
}


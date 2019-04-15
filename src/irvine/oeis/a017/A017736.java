package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017736 Binomial coefficients <code>C(n,72)</code>.
 * @author Sean A. Irvine
 */
public class A017736 implements Sequence {

  private long mN = 71;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 72);
  }
}


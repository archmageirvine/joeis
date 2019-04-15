package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017733 Binomial coefficients <code>C(n,69)</code>.
 * @author Sean A. Irvine
 */
public class A017733 implements Sequence {

  private long mN = 68;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 69);
  }
}


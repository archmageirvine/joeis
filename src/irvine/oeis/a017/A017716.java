package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017716 Binomial coefficients <code>C(n,52)</code>.
 * @author Sean A. Irvine
 */
public class A017716 implements Sequence {

  private long mN = 51;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 52);
  }
}


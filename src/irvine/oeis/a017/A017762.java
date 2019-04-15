package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017762 Binomial coefficients <code>C(n,98)</code>.
 * @author Sean A. Irvine
 */
public class A017762 implements Sequence {

  private long mN = 97;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 98);
  }
}


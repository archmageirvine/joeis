package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000579 Figurate numbers or binomial coefficients <code>C(n,6)</code>.
 * @author Sean A. Irvine
 */
public class A000579 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6);
  }
}


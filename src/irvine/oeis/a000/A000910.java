package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000910 <code>5*C(n,6)</code>.
 * @author Sean A. Irvine
 */
public class A000910 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 6).multiply(5);
  }
}


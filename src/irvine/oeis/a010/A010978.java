package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010978 <code>a(n) = binomial(n,25)</code>.
 * @author Sean A. Irvine
 */
public class A010978 implements Sequence {

  private long mN = 24;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 25);
  }
}


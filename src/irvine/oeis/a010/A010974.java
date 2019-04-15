package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010974 <code>a(n) = binomial(n,21)</code>.
 * @author Sean A. Irvine
 */
public class A010974 implements Sequence {

  private long mN = 20;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 21);
  }
}


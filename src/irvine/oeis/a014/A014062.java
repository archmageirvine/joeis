package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014062 <code>a(n) = binomial(n^2, n)</code>.
 * @author Sean A. Irvine
 */
public class A014062 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN * mN, mN);
  }
}

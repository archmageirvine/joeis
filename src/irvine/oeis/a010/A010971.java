package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010971 <code>a(n) =</code> binomial(n,18).
 * @author Sean A. Irvine
 */
public class A010971 implements Sequence {

  private long mN = 17;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 18);
  }
}


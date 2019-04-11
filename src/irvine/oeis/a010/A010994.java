package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010994 <code>a(n) =</code> binomial coefficient C(n,41).
 * @author Sean A. Irvine
 */
public class A010994 implements Sequence {

  private long mN = 40;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 41);
  }
}


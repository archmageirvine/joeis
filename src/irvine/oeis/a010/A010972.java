package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010972 <code>a(n) =</code> binomial(n,19).
 * @author Sean A. Irvine
 */
public class A010972 implements Sequence {

  private long mN = 18;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 19);
  }
}


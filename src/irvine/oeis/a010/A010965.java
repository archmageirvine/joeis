package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010965 <code>a(n) =</code> binomial(n,12).
 * @author Sean A. Irvine
 */
public class A010965 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 12);
  }
}


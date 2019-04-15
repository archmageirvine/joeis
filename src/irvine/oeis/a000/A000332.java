package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000332 Binomial coefficient <code>binomial(n,4) = n*(n-1)*(n-2)*(n-3)/24</code>.
 * @author Sean A. Irvine
 */
public class A000332 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN < 4 ? Z.ZERO : Binomial.binomial(mN, 4);
  }
}


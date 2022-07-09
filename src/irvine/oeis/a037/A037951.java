package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037951 a(n) = binomial(n, floor((n-3)/2)).
 * @author Sean A. Irvine
 */
public class A037951 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 3 ? Z.ZERO : Binomial.binomial(mN, (mN - 3) / 2);
  }
}



package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037957 C(n,[ (n-6)/2 ]).
 * @author Sean A. Irvine
 */
public class A037957 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 6 ? Z.ZERO : Binomial.binomial(mN, (mN - 6) / 2);
  }
}



package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037953 C(n,[ (n-5)/2 ]).
 * @author Sean A. Irvine
 */
public class A037953 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 5 ? Z.ZERO : Binomial.binomial(mN, (mN - 5) / 2);
  }
}



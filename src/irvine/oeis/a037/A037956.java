package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037956 C(n,[ (n-4)/2 ]).
 * @author Sean A. Irvine
 */
public class A037956 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 4 ? Z.ZERO : Binomial.binomial(mN, (mN - 4) / 2);
  }
}



package irvine.oeis.a034;

import irvine.math.LongUtils;
import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034280 Decimal part of a(n)^(1/5) starts with a 'nine digits' anagram.
 * @author Sean A. Irvine
 */
public class A034280 extends Sequence0 {

  private static final CR C = CR.valueOf(1000000000);
  private static final CR ONE_FIFTH = CR.valueOf(new Q(1, 5));
  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.syndrome(ComputableReals.SINGLETON.pow(CR.valueOf(++mN), ONE_FIFTH).frac().multiply(C).floor().longValue()) == 0b1111111110) {
        return Z.valueOf(mN);
      }
    }
  }
}


package irvine.oeis.a034;

import irvine.math.LongUtils;
import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034286 Decimal part of n^(1/11) starts with a 'nine digits' anagram.
 * @author Sean A. Irvine
 */
public class A034286 extends Sequence1 {

  private static final CR C = CR.valueOf(1000000000);
  private static final CR ONE_ELEVENTH = CR.valueOf(new Q(1, 11));
  private long mN = 5086;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.syndrome(ComputableReals.SINGLETON.pow(CR.valueOf(++mN), ONE_ELEVENTH).frac().multiply(C).floor().longValue()) == 0b1111111110) {
        return Z.valueOf(mN);
      }
    }
  }
}


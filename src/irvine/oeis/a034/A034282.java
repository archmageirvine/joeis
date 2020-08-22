package irvine.oeis.a034;

import irvine.math.LongUtils;
import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034282 Decimal part of a(n)^(1/7) starts with a 'nine digits' anagram.
 * @author Sean A. Irvine
 */
public class A034282 implements Sequence {

  private static final CR C = CR.valueOf(1000000000);
  private static final CR ONE_SEVENTH = CR.valueOf(new Q(1, 7));
  private long mN = 550;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.syndrome(ComputableReals.SINGLETON.pow(CR.valueOf(++mN), ONE_SEVENTH).frac().multiply(C).floor().longValue()) == 0b1111111110) {
        return Z.valueOf(mN);
      }
    }
  }
}


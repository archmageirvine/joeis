package irvine.oeis.a034;

import irvine.math.LongUtils;
import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034278 Decimal part of <code>a(n)^(1/3)</code> starts with a 'nine digits' anagram.
 * @author Sean A. Irvine
 */
public class A034278 implements Sequence {

  private static final CR C = CR.valueOf(1000000000);
  private long mN = 428;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.syndrome(ComputableReals.SINGLETON.pow(CR.valueOf(++mN), CR.ONE_THIRD).frac().multiply(C).floor().longValue()) == 0b1111111110) {
        return Z.valueOf(mN);
      }
    }
  }
}


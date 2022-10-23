package irvine.oeis.a034;

import irvine.math.LongUtils;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034277 Decimal part of a(n)^(1/2) starts with a 'nine digits' anagram.
 * @author Sean A. Irvine
 */
public class A034277 extends Sequence0 {

  private static final CR C = CR.valueOf(1000000000);
  private long mN = 85;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.syndrome(CR.valueOf(++mN).sqrt().frac().multiply(C).floor().longValue()) == 0b1111111110) {
        return Z.valueOf(mN);
      }
    }
  }
}


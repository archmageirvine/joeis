package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034277 Decimal part of a(n)^(1/2) starts with a 'nine digits' anagram.
 * @author Sean A. Irvine
 */
public class A034277 extends Sequence1 {

  private static final CR C = CR.valueOf(1000000000);
  private long mN = 85;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SYNDROME.i(CR.valueOf(++mN).sqrt().frac().multiply(C).floor().longValue()) == 0b1111111110) {
        return Z.valueOf(mN);
      }
    }
  }
}


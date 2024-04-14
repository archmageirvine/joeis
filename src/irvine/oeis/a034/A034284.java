package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034284 Decimal part of a(n)^(1/9) starts with a 'nine digits' anagram.
 * @author Sean A. Irvine
 */
public class A034284 extends Sequence0 {

  private static final CR C = CR.valueOf(1000000000);
  private static final CR ONE_NINTH = CR.valueOf(new Q(1, 9));
  private long mN = 470;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SYNDROME.i(ComputableReals.SINGLETON.pow(CR.valueOf(++mN), ONE_NINTH).frac().multiply(C).floor().longValue()) == 0b1111111110) {
        return Z.valueOf(mN);
      }
    }
  }
}


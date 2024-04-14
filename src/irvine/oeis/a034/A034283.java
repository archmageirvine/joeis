package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034283 Decimal part of a(n)^(1/8) starts with a 'nine digits' anagram.
 * @author Sean A. Irvine
 */
public class A034283 extends Sequence0 {

  private static final CR C = CR.valueOf(1000000000);
  private static final CR ONE_EIGHTH = CR.valueOf(new Q(1, 8));
  private long mN = 3926;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SYNDROME.i(ComputableReals.SINGLETON.pow(CR.valueOf(++mN), ONE_EIGHTH).frac().multiply(C).floor().longValue()) == 0b1111111110) {
        return Z.valueOf(mN);
      }
    }
  }
}


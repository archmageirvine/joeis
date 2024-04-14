package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A035304 Decimal part of a(n)^(1/n) starts with a pandigital anagram (digits 0 through 9 in some order).
 * @author Sean A. Irvine
 */
public class A035304 extends Sequence2 {

  private static final CR C = CR.valueOf(10000000000L);
  private long mN = 1;

  @Override
  public Z next() {
    final CR power = CR.valueOf(new Q(1, ++mN));
    long m = 0;
    while (true) {
      final long h = ComputableReals.SINGLETON.pow(CR.valueOf(++m), power).frac().multiply(C).floor().longValue();
      final long g = h < 1000000000 ? h * 10 : h;  // Deal with leading 0
      if (Functions.SYNDROME.i(g) == 0b1111111111) {
        return Z.valueOf(m);
      }
    }
  }
}


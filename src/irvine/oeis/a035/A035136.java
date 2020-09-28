package irvine.oeis.a035;

import irvine.math.LongUtils;
import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035136 Decimal part of a(n)^(1/n) starts with a 'nine digits' anagram.
 * @author Sean A. Irvine
 */
public class A035136 implements Sequence {

  private static final CR C = CR.valueOf(1000000000);
  private long mN = 1;

  @Override
  public Z next() {
    final CR power = CR.valueOf(new Q(1, ++mN));
    long m = 0;
    while (true) {
      if (LongUtils.syndrome(ComputableReals.SINGLETON.pow(CR.valueOf(++m), power).frac().multiply(C).floor().longValue()) == 0b1111111110) {
        return Z.valueOf(m);
      }
    }
  }
}


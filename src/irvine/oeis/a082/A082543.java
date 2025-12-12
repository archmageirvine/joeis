package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A082543 Take a string of n x's and insert n-1 ^'s and n-1 pairs of parentheses in all possible ways. Sequence gives number of distinct integer values when x=sqrt(2).
 * @author Sean A. Irvine
 */
public class A082543 extends A082499 {

  private CR powSqrt2(final CR x) {
    return CR.SQRT2.pow(x);
  }

  @Override
  public Z next() {
    final TreeSet<CR> uniq = step();
    long cnt = 0;
    for (final CR v : uniq) {
      final CR e0 = powSqrt2(v);
      final CR e1 = powSqrt2(e0);
      if (e1.isInteger()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

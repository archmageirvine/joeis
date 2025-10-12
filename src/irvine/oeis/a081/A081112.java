package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081112 Let s(x)=floor(Pi*x); sequence gives the least k such that n divides s^k(n) where s^k(x) denotes s(s(s..s(x))..) k times, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A081112 extends Sequence1 {

  private long mN = 0;

  private Z s(final Z n) {
    return CR.PI.multiply(n).floor();
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    Z t = Z.valueOf(mN);
    do {
      ++k;
      t = s(t);
    } while (t.mod(mN) != 0);
    return Z.valueOf(k);
  }
}

package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081111 Let s(x)=floor(phi*x) where phi is the golden ratio (1+sqrt(5))/2; sequence gives the least k such that n divides s^k(n) where s^k(x) denotes s(s(s..s(x))..) k times, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A081111 extends Sequence1 {

  private long mN = 0;

  private Z s(final Z n) {
    return CR.PHI.multiply(n).floor();
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

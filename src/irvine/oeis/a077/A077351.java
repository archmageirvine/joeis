package irvine.oeis.a077;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077351 Smallest multiple of n using all the digits of all its divisors (a permutation of the concatenation of its divisors), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077351 extends Sequence1 {

  // After R. J. Mathar

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z[] ds = Jaguar.factor(mN).divisorsSorted();
    final StringBuilder sb = new StringBuilder();
    for (final Z d : ds) {
      sb.append(d);
    }
    final Z ndvs = Functions.DIGIT_SORT_ASCENDING.z(new Z(sb));
    final Z t = Z.TEN.pow(sb.length() - 1);
    final Z lim = t.multiply(ndvs.mod(10));
    Z m = t.divide(mN);
    while (m.multiply(mN).compareTo(lim) < 0) {
      final Z mn = m.multiply(mN);
      final Z muldivs = Functions.DIGIT_SORT_ASCENDING.z(mn);
      if (muldivs.equals(ndvs)) {
        return mn;
      }
      m = m.add(1);
    }
    return Z.ZERO;
  }
}

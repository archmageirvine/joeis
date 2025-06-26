package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A383677 Irregular triangle read by rows: T(n,k), 2 &lt;= n , 3 &lt;= k &lt;= largest k such that A067175(k) &lt;= n , is the smallest n-digit number m such that omega(m) = A001221(m) = k, and its largest prime factor equals the sum of its remaining prime factors. or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A383677 extends Sequence2 {

  private long mN = 2;
  private long mM = 2;

  @Override
  public Z next() {
    if (Functions.DIGIT_LENGTH.l(Functions.PRIMORIAL_COUNT.z(++mM)) >= mN + 1) {
      ++mN;
      mM = 3;
    }
    Z k = Z.TEN.pow(mN - 1);
    final Z lim = k.multiply(10);
    while (k.compareTo(lim) < 0) {
      if (Functions.OMEGA.l(k) == mM && 2 * Functions.GPF.l(k) == Functions.SOPF.l(k)) {
        return k;
      }
      k = k.add(1);
    }
    return Z.NEG_ONE;
  }
}


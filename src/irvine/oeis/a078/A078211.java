package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078211 Smallest multiple of n^2 beginning and ending in n, or 0 if no such multiple exists.
 * @author Sean A. Irvine
 */
public class A078211 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final int l = Functions.DIGIT_LENGTH.i(mN);
    final int m2 = Functions.VALUATION.i(mN, 2);
    if (m2 > 0 && m2 < l) {
      return Z.ZERO;
    }
    final int m5 = Functions.VALUATION.i(mN, 5);
    if (m5 > 0 && m5 < l) {
      return Z.ZERO;
    }
    for (int j = 0; j < l; ++j) {
      final Z tenj = Z.TEN.pow(j);
      if (mN.mod(Z.TEN.pow(l - j)).equals(mN.divide(tenj))) {
        final Z t = mN.multiply(tenj).add(mN.mod(tenj));
        if (t.mod(mN.square()).isZero()) {
          return t;
        }
      }
    }
    final Z u = Z.TEN.pow(l).add(1);
    if (u.mod(mN).isZero()) {
      return u.multiply(mN);
    }
    // Max Alekseyev has a better method for these cases
    final Z n2 = mN.square();
    Z mod = Z.ONE;
    while (mod.compareTo(mN) <= 0) {
      mod = mod.multiply(10);
    }
    Z t = n2;
    final String ns = mN.toString();
    while (true) {
      if (t.mod(mod).equals(mN) && t.toString().startsWith(ns)) {
        return t;
      }
      t = t.add(n2);
    }
  }
}


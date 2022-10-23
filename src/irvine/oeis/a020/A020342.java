package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020342 Vampire numbers: (definition 1): n has a nontrivial factorization using n's digits.
 * @author Sean A. Irvine
 */
public class A020342 extends Sequence1 {

  private Z mN = Z.valueOf(125);

  private boolean isZero(final int... s) {
    for (final int v : s) {
      if (v != 0) {
        return false;
      }
    }
    return true;
  }

  private boolean isOk(final int[] s, Z v) {
    boolean ok = true;
    while (!v.isZero()) {
      if (--s[(int) v.mod(10)] < 0) {
        ok = false;
      }
      v = v.divide(10);
    }
    return ok;
  }

  private void replace(final int[] s, Z v) {
    while (!v.isZero()) {
      ++s[(int) v.mod(10)];
      v = v.divide(10);
    }
  }

  private boolean isVampire(final Z n, final Z[] div, final int pos, final int[] syndrome) {
    if (Z.ONE.equals(n)) {
      return isZero(syndrome);
    }
    for (int k = pos; k < div.length; ++k) {
      final Z[] qr = n.divideAndRemainder(div[k]);
      if (qr[1].isZero()) {
        if (isOk(syndrome, div[k]) && isVampire(qr[0], div, k, syndrome)) {
          return true;
        }
        replace(syndrome, div[k]);
      }
    }
    return false;
  }

  private int[] syndrome(final Z n) {
    final int[] s = new int[10];
    replace(s, n);
    return s;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] syndrome = syndrome(mN);
      final Z[] d = Jaguar.factor(mN).divisors();
      final Z[] proper = new Z[d.length - 2];
      for (int k = 0, j = 0; k < d.length; ++k) {
        if (!mN.equals(d[k]) && !Z.ONE.equals(d[k])) {
          proper[j++] = d[k];
        }
      }
      if (isVampire(mN, proper, 0, syndrome)) {
        return mN;
      }
    }
  }
}

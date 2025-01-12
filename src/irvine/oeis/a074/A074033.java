package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074033 Number of degree-n irreducible polynomials over GF(4) with trace 1 and subtrace 0.
 * @author Sean A. Irvine
 */
public class A074033 extends Sequence1 {

  // After Andrey Zabolotskiy

  private int mN = 0;
  protected final Z mQ;

  protected A074033(final int q, final int k) {
    mQ = Z.valueOf(q).pow(k);
  }

  /** Construct the sequence. */
  public A074033() {
    this(2, 2);
  }

  protected Z qp(final int n) {
    return mQ.pow(n + 1); // +1 to avoid need for rationals
  }

  private Z v(final int t) {
    return t == 0 ? mQ.subtract(1) : Z.NEG_ONE;
  }

  protected Z dd(final int a, final int n) {
    // Some contortions to avoid rationals included here
    final Z t;
    switch (n & 3) {
      case 1:
        t = qp(n / 2).multiply(v(a));
        break;
      case 2:
        t = qp(n / 2).negate();
        break;
      case 3:
        t = qp(n / 2).multiply(v(1 - a));
        break;
      default: // 4 (or 0)
        t = Z.ZERO;
        break;
    }
    return t.add(qp(n - 1)).divide(mQ.square());
  }

  protected Z h(final int n, final int a) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      if (dd.isOdd()) {
        final int d = dd.intValue();
        final int mu = Functions.MOBIUS.i(d);
        if (mu != 0) {
          final Z t = dd(a + (d - 1) / 2 & 1, n / d);
          sum = sum.signedAdd(mu == 1, t);
        }
      }
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    return h(++mN, 0);
  }
}

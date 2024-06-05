package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074031 Number of degree-n irreducible polynomials over GF(4) with trace 0 and subtrace 0.
 * @author Sean A. Irvine
 */
public class A074031 extends Sequence1 {

  // After Andrey Zabolotskiy

  private int mN = 0;
  private final int mK;
  private final Z mQ;

  protected A074031(final int q, final int k) {
    mQ = Z.valueOf(q).pow(k);
    mK = k;
  }

  /** Construct the sequence. */
  public A074031() {
    this(2, 2);
  }

  protected Z qp(final int n) {
    return mQ.pow(n + 1); // +1 to avoid need for rationals
  }

  private Z v(final int t) {
    return t == 0 ? mQ.subtract(1) : Z.NEG_ONE;
  }

  protected Z h(final int n, final int a) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      if (dd.isOdd()) {
        final int d = dd.intValue();
        final int mu = Functions.MOBIUS.i(d);
        if (mu != 0) {
          final Z t = dd(a, n / d);
          sum = sum.signedAdd(mu == 1, (n & 1) == 0 ? t.subtract(qp(n / (2 * d) - 1)) : t);
        }
      }
    }
    return sum.divide(n).divide(mQ);  // / mQ to account for adjustment in qp()
  }

  private Z dd(final int a, final int n) {
    final long m = (n + 1) / 4;
    Z t;
    switch (n & 3) {
      case 0:
        t = qp((n - 2) / 2).multiply(v(a)).negate();
        break;
      case 2:
        t = Z.ZERO;
        break;
      default: // 1, 3
        t = qp((n - 3) / 2).multiply(v(a));
        break;
    }
    if (((m * mK) & 1) == 1) {
      t = t.negate();
    }
    return t.add(qp(n - 2));
  }

  @Override
  public Z next() {
    return h(++mN, 0);
  }
}

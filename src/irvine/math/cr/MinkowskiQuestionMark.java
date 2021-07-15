package irvine.math.cr;

import irvine.math.z.Z;

/**
 * The Minkowski question mark function.
 * @author Sean A. Irvine
 */
public class MinkowskiQuestionMark extends CR {

  private static final int EXTRA_PRECISION = 2;
  private final CR mX;

  /**
   * Minkowski question mark function.
   * @param x argument
   */
  public MinkowskiQuestionMark(final CR x) {
    mX = x;
  }

  @Override
  protected Z approximate(final int p) {
    // this one actually compute the inverse function!
//    if (p >= 0) {
//      return Z.ZERO;
//    }
//    final int opPrec = EXTRA_PRECISION - p;
//    final Z t = mX.approximate(-opPrec);
//    final int[] rle = new int[opPrec + 1];
//    boolean s = false;
//    int j = 1;
//    for (int k = opPrec; k >= 0; --k) {
//      if (t.testBit(k) == s) {
//        ++rle[j];
//      } else {
//        ++rle[++j];
//        s = !s;
//      }
//    }
//    Q sum = new Q(1, rle[j--]);
//    for (int k = j; k >= 0; --k) {
//      sum = sum.reciprocal().add(rle[k]);
//    }
//    return CR.valueOf(sum).approximate(p);

//    if (p >= 0) {
//      return Z.ZERO;
//    }
//    final int opPrec = EXTRA_PRECISION - p;
//    final int bitsLim = 3 * IntegerUtils.lg(opPrec);
//    final Convergents conv = new Convergents(mX, 1000);
//    conv.next();
//    Z currentSum = conv.frac().shiftLeft(opPrec);
//    int power = -1;
//    long k = 0;
//    while (conv.hasNext()) {
//      conv.next();
//      final Z f = conv.frac();
//      if (f.bitLength() > bitsLim) {
//        break;
//      }
//      power += f.intValueExact();
//      if (power > opPrec) {
//        break;
//      }
//      currentSum = currentSum.signedAdd((++k & 1) == 1, Z.ONE.shiftLeft(opPrec - power));
//    }
//    return scale(currentSum, -EXTRA_PRECISION);

//    if (p >= 0) {
//      return Z.ZERO;
//    }
//    final int opPrec = EXTRA_PRECISION - p;
    Z pp = mX.floor();
    Z q = Z.ONE;
    Z r = pp.add(1);
    Z s = Z.ONE;
    CR d = CR.ONE;
    CR y = CR.valueOf(pp);

    for (int k = 0; k <= -p; ++k) {
//    while (true) { /* invariants: q * r - p * s == 1 && (double)p / q <= x && x < (double)r / s */
      d = d.divide(CR.TWO);
      //System.out.println(y.add(d).approximate(p) + " cf. " + y.approximate(p) + " p=" + p + " y=" + y);
//      if (y.add(d).approximate(p).equals(y.approximate(p))) {
//        break; /* reached max possible precision */
//      }
      final Z m = pp.add(r);
//        if ((m.signum() < 0) ^ (pp.signum() < 0)) {
//          break; /* sum overflowed */
//        }
      final Z n = q.add(s);
//        if (n.signum() < 0) {
//          break; /* sum overflowed */
//        }

      if (mX.compareTo(CR.valueOf(m).divide(CR.valueOf(n)), p) < 0) {
        r = m;
        s = n;
      } else {
        y = y.add(d);
        pp = m;
        q = n;
      }
    }
    return y.add(d).approximate(p);
  }


//  double minkowski(double x) {
//    long p = x;
//    if ((double)p > x) --p; /* p=floor(x) */
//    long q = 1, r = p + 1, s = 1, m, n;
//    double d = 1, y = p;
//    if (x < (double)p || (p < 0) ^ (r <= 0))
//        return x; /* out of range ?(x) =~ x */
//    for (;;) { /* invariants: q * r - p * s == 1 && (double)p / q <= x && x < (double)r / s */
//        d /= 2;
//        if (y + d == y)
//            break; /* reached max possible precision */
//        m = p + r;
//        if ((m < 0) ^ (p < 0))
//            break; /* sum overflowed */
//        n = q + s;
//        if (n < 0)
//            break; /* sum overflowed */
//
//        if (x < (double)m / n) {
//            r = m;
//            s = n;
//        } else {
//            y += d;
//            p = m;
//            q = n;
//        }
//    }
//    return y + d; /* final round-off */
//}


  /**
   * For testing.
   * @param args number to compute function for
   */
  public static void main(final String[] args) {
    System.out.println(new MinkowskiQuestionMark(CR.valueOf(args[0], 10)).toString(100));
  }
}


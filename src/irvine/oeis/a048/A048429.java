package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A048429 Smallest numerator of a fraction using palindromes that approximates Pi to at least n digits after the decimal point.
 * @author Sean A. Irvine
 */
public class A048429 extends A002113 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Z mT = Z.ONE;
  {
    super.next();
    super.next();
    super.next();
  }
  private Z mP = super.next();

  protected CR getTarget() {
    return CR.PI;
  }

  protected Z select(final Z num, final Z den) {
    if (mVerbose) {
      StringUtils.message(num + "/" + den);
    }
    return num;
  }

  @Override
  public Z next() {
    mT = mT.multiply(10);
    final Z expected = getTarget().multiply(mT).floor();
    while (true) {
      final CR p = CR.valueOf(mP);
      final String sden = p.divide(getTarget()).round().toString();

      // Find closest palindrome to sden
      final String palinDen;
      if ((sden.length() & 1) == 0) {
        final String left = sden.substring(0, sden.length() / 2);
        palinDen = left + new StringBuilder(left).reverse();
      } else {
        palinDen = sden.substring(0, (sden.length() + 1) / 2) + new StringBuilder(sden.substring(0, sden.length() / 2)).reverse();
      }
      final Z den = new Z(palinDen);

      final Z v = mP.multiply(mT).divide(den);
      if (v.equals(expected)) {
        return select(mP, den);
      }
      mP = super.next();
    }
  }
}

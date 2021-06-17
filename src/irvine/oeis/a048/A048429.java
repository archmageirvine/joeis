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

  private Z closestPalindrome(final Z n) {
    // in extreme cases there can be 2 solutions 100 -> 99 : 101, this picks the biggest
    final String ns = n.toString();
    if (StringUtils.isPalindrome(ns)) {
      return n;
    }
    if ((ns.length() & 1) == 0) {
      final String left = ns.substring(0, ns.length() / 2);
      final String p1s = left + new StringBuilder(left).reverse();
      final Z p1 = new Z(p1s);
      final Z d = n.subtract(p1);
      if (d.signum() < 0) {
        final String l2 = new Z(left).subtract(1).toString();
        final String p2s = l2 + new StringBuilder(l2).reverse();
        final Z p2 = new Z(p2s);
        final Z e = n.subtract(p2);
        return e.abs().compareTo(d.abs()) < 0 ? p2 : p1;
      } else {
        final String l2 = new Z(left).add(1).toString();
        final String p2s = l2 + new StringBuilder(l2).reverse();
        final Z p2 = new Z(p2s);
        final Z e = n.subtract(p2);
        return e.abs().compareTo(d.abs()) < 0 ? p2 : p1;
      }
    } else {
      final String left = ns.substring(0, (ns.length() + 1) / 2);
      final String p1s = left + new StringBuilder(left.substring(0, left.length() - 1)).reverse();
      final Z p1 = new Z(p1s);
      final Z d = n.subtract(p1);
      if (d.signum() < 0) {
        final String l2 = new Z(left).subtract(1).toString();
        final String p2s = l2 + new StringBuilder(l2.substring(0, l2.length() - 1)).reverse();
        final Z p2 = new Z(p2s);
        final Z e = n.subtract(p2);
        return e.abs().compareTo(d.abs()) < 0 ? p2 : p1;
      } else {
        final String l2 = new Z(left).add(1).toString();
        final String p2s = l2 + new StringBuilder(l2.substring(0, l2.length() - 1)).reverse();
        final Z p2 = new Z(p2s);
        final Z e = n.subtract(p2);
        return e.abs().compareTo(d.abs()) < 0 ? p2 : p1;
      }
    }
  }

  @Override
  public Z next() {
    mT = mT.multiply(10);
    final Z expected = getTarget().multiply(mT).floor();
    while (true) {
      final CR p = CR.valueOf(mP);
      final Z den = closestPalindrome(p.divide(getTarget()).round());
      final Z v = mP.multiply(mT).divide(den);
      if (v.equals(expected)) {
        return select(mP, den);
      }
      mP = super.next();
    }
  }

}

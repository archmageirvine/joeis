package irvine.oeis.a093;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A093017 Luhn algorithm double-and-add sum of digits of n.
 * @author Georg Fischer
 */
public class A093017 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A093017() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(luhn(n));
  }

  /**
   * Luhn algorithm: digit sum of a raw number.
   * @param n number (without check digit)
   * @return sum of digits, every second doubled
   */
  public static long luhn(final Z n) {
    int pos = 0;
    long s = 0;
    Z m = n;
    while (!m.isZero()) {
      final long digit = m.mod(10);
      final long wd = (pos & 1) == 0 ? digit : 2 * digit;
      s += wd >= 10 ? wd - 9 : wd;
      m = m.divide(Z.TEN);
      ++pos;
    }
    return s;
  }

  /**
   * Luhn algorithm applied to a raw number.
   * @param n number (without check digit)
   * @return check digit
   */
  public static long check(final Z n) {
    int pos = 0;
    long s = 0;
    Z m = n;
    while (!m.isZero()) {
      final long digit = m.mod(10);
      long wd = (pos & 1) == 0 ? 2 * digit : digit;
      wd = (wd >= 10) ? wd - 9 : wd;
      s += wd;
      m = m.divide(Z.TEN);
      ++pos;
    }
    return (10 - (s % 10)) % 10;
  }

/*
    my ($num) = @_;
    my $pos = 0;
    my $sum = 0;
    while ($num != 0) {
        my $dig = $num % 10;
        my $wd = (($pos & 1) == 0) ? 2*$dig : $dig;
        $wd = ($wd >= 10) ? $wd - 9 : $wd;
        $sum += $wd;
        if ($debug > 0) {
            print "num=$num, dig=$dig, wd=$wd, sum=$sum\n";
        }
        $num /= 10;
        $pos ++;
    }
    return (10 - ($sum % 10)) % 10;
*/

  /**
   * Check whether a number has a valid Luhn check digit.
   * @param n number (with check digit)
   * @return true iff the check digit is ok.
   */
  public static boolean isOk(final Z n) {
    final long cd = n.mod(10);
    return check(n.divide(10)) == cd;
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

package irvine.oeis.a084;

import java.time.LocalDate;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084427 Gregorian calendar years with Ascension Day in April.
 * @author Sean A. Irvine
 */
public class A084427 extends Sequence1 {

  private int mN = 1582;

  private LocalDate easter(final int year) {
    final int a = year % 19;
    final int b = year / 100;
    final int c = year % 100;
    final int d = b / 4;
    final int e = b % 4;
    final int f = (b + 8) / 25;
    final int g = (b - f + 1) / 3;
    final int h = (19 * a + b - d - g + 15) % 30;
    final int i = c / 4;
    final int k = c % 4;
    final int l = (32 + 2 * e + 2 * i - h - k) % 7;
    final int m = (a + 11 * h + 22 * l) / 451;
    final int n = h + l - 7 * m + 114;
    final int month = n / 31;     // 3=March, 4=April
    final int day = (n % 31) + 1;
    return LocalDate.of(year, month, day);
  }

  private boolean is(final int year) {
    final LocalDate easter = easter(year);
    final LocalDate ascension = easter.plusDays(39);
    return ascension.getMonthValue() == 4;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN < 0) {
        throw new UnsupportedOperationException();
      }
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

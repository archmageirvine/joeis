package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056999 Number of days in months of Persian calendar.
 * @author Sean A. Irvine
 */
public class A056999 extends Sequence1 {

  private static final int[] MONTH_LENGTHS = {31, 31, 31, 31, 31, 31, 30, 30, 30, 30, 30, 29};
  private long mN = 474; // Offset year
  private int mM = -1;

  private static long ceil(final double double1, final double double2) {
    return (long) (double1 - double2 * Math.floor(double1 / double2));
  }

  // From https://www.javatips.net/api/Persian-Date-Picker-Dialog-master/persiandatepicker/src/main/java/ir/hamsaa/persiandatepicker/util/PersianCalendarUtils.java
  private static boolean isPersianLeapYear(final long persianYear) {
    return ceil((38.0 + (ceil(persianYear - 474L, 2820L) + 474L)) * 682.0, 2816.0) < 682L;
  }

  @Override
  public Z next() {
    final int m = MONTH_LENGTHS[++mM];
    if (mM == 11) {
      mM = -1;
      if (isPersianLeapYear(++mN)) {
        return Z.valueOf(m + 1);
      }
    }
    return Z.valueOf(m);
  }
}

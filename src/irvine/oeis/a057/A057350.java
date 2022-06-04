package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057350.
 * @author Ulrich Greve
 * @author David Greve
 * @author Sean A. Irvine
 */
public class A057350 implements Sequence {

  // The code is freely usable for non-profit purposes when this Copyright notice is included.

  private int mYear = 5759;
  private int mMonth = 12;

  private int hebrewCalendarElapsedDays(final int year) {
    /* Months in complete cycles so far */
    int value = 235 * ((year - 1) / 19);
    int monthsElapsed = value;

    /* Regular months in this cycle */
    value = 12 * ((year - 1) % 19);
    monthsElapsed += value;

    /* Leap months this cycle */
    value = ((year - 1) % 19 * 7 + 1) / 19;
    monthsElapsed += value;

    final int partsElapsed = monthsElapsed % 1080 * 793 + 204;
    final int hoursElapsed = 5 + monthsElapsed * 12 + monthsElapsed / 1080 * 793 + partsElapsed / 1080;

    /* Conjunction day */
    final int day = 1 + 29 * monthsElapsed + hoursElapsed / 24;

    /* Conjunction parts */
    final int parts = hoursElapsed % 24 * 1080 + partsElapsed % 1080;

    int alternativeDay;
    /* If new moon is at or after midday, */
    if (parts >= 19440
      /* ...or is on a Tuesday... */
      || (day % 7 == 2
      /* at 9 hours, 204 parts or later */
      && parts >= 9924
      /* of a common year */
      && !isHebrewLeapYear(year))
      /* ...or is on a Monday at... */
      || (day % 7 == 1
      /* 15 hours, 589 parts or later... */
      && parts >= 16789
      /* at the end of a leap year */
      && isHebrewLeapYear(year - 1))) {
      /* Then postpone Rosh HaShanah one day */
      alternativeDay = day + 1;
    } else {
      alternativeDay = day;
    }

    /* If Rosh HaShanah would occur on Sunday, Wednesday, or Friday */
    if (alternativeDay % 7 == 0 || alternativeDay % 7 == 3 || alternativeDay % 7 == 5) {
      /* Then postpone it one (more) day and return */
      ++alternativeDay;
    }

    return alternativeDay;
  }

  private int daysInHebrewYear(final int year) {
    return hebrewCalendarElapsedDays(year + 1) - hebrewCalendarElapsedDays(year);
  }

  private boolean isHebrewLeapYear(final int year) {
    return (year * 7 + 1) % 19 < 7;
  }

  private boolean isLongHeshvan(final int year) {
    return daysInHebrewYear(year) % 10 == 5;
  }

  private boolean isShortKislev(final int year) {
    return daysInHebrewYear(year) % 10 == 3;
  }

  private int getLastDayOfJewishMonth(final int month, final int year) {
    if (month == 2 || month == 4 || month == 6 || month == 10 || month == 13) {
      return 29;
    }
    if (month == 12 && !isHebrewLeapYear(year)) {
      return 29;
    }
    if (month == 8 && !isLongHeshvan(year)) {
      return 29;
    }
    if (month == 9 && isShortKislev(year)) {
      return 29;
    }
    return 30;
  }

  @Override
  public Z next() {
    if (++mMonth == (isHebrewLeapYear(mYear) ? 14 : 13)) {
      mMonth = 1;
      ++mYear;
    }
    return Z.valueOf(getLastDayOfJewishMonth(mMonth, mYear));
  }
}

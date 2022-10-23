package irvine.oeis.a002;

import java.util.Calendar;
import java.util.GregorianCalendar;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002651 Dates at 16-day intervals starting at the beginning of a leap year.
 * @author Sean A. Irvine
 */
public class A002651 extends Sequence1 {

  // WARNING This sequence is poorly defined for what happens after 400 years.

  private final GregorianCalendar mCal = new GregorianCalendar(2000, Calendar.JANUARY, 0);

  @Override
  public Z next() {
    mCal.add(Calendar.DAY_OF_MONTH, 16);
    return Z.valueOf(mCal.get(Calendar.DAY_OF_MONTH));
  }
}

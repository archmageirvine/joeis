package irvine.oeis.a003;

import java.util.Calendar;
import java.util.GregorianCalendar;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003786 Dates at weekly intervals from Jan 01 of leap year.
 * @author Sean A. Irvine
 */
public class A003786 extends Sequence1 {

  // WARNING This sequence is poorly defined for what happens after 400 years.

  private final GregorianCalendar mCal = new GregorianCalendar(2021, Calendar.DECEMBER, 25);

  @Override
  public Z next() {
    mCal.add(Calendar.DAY_OF_MONTH, 7);
    return Z.valueOf(mCal.get(Calendar.DAY_OF_MONTH));
  }
}

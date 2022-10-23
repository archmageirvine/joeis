package irvine.oeis.a001;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001356 Dates at fortnightly intervals from Jan 01 in the Julian calendar.
 * @author Sean A. Irvine
 */
public class A001356 extends Sequence1 {

  // Month is zero based
  private final GregorianCalendar mCalendar = new GregorianCalendar(4, Calendar.DECEMBER, 18, 0, 0, 1);
  {
    mCalendar.setGregorianChange(new Date(Long.MAX_VALUE));
  }

  @Override
  public Z next() {
    mCalendar.add(Calendar.DAY_OF_MONTH, 14);
    //System.out.println(mCalendar.toString());
    return Z.valueOf(mCalendar.get(Calendar.DAY_OF_MONTH));
  }
}

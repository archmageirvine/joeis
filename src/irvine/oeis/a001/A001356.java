package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * A001356 Dates at fortnightly intervals from Jan 01 in the Julian calendar.
 * @author Sean A. Irvine
 */
public class A001356 implements Sequence {

  // Month is zero based
  private final GregorianCalendar mCalendar = new GregorianCalendar(2004, 11, 18, 0, 0, 1);

  @Override
  public Z next() {
    mCalendar.add(Calendar.DAY_OF_MONTH, 14);
    //System.out.println(mCalendar.toString());
    return Z.valueOf(mCalendar.get(Calendar.DAY_OF_MONTH));
  }
}

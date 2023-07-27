package irvine.oeis.a008;

import java.util.Calendar;
import java.util.GregorianCalendar;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008686 Day-of-month at weekly intervals from Jan 01 of a non-leap year (a finite sequence with 53 terms).
 * @author Sean A. Irvine
 */
public class A008686 extends Sequence1 {

  private final GregorianCalendar mCal = new GregorianCalendar(2000, Calendar.DECEMBER, 25);

  @Override
  public Z next() {
    mCal.add(Calendar.DAY_OF_MONTH, 7);
    return Z.valueOf(mCal.get(Calendar.DAY_OF_MONTH));
  }
}

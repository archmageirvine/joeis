package irvine.oeis.a008;

import java.util.Calendar;
import java.util.GregorianCalendar;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008685 Lengths of months in the Gregorian calendar.
 * @author Sean A. Irvine
 */
public class A008685 implements Sequence {

  private int mYear = 2000;
  private int mMonth = 11;

  @Override
  public Z next() {
    if (++mMonth == 12) {
      mMonth = 0;
      ++mYear;
    }
    return Z.valueOf(new GregorianCalendar(mYear, mMonth, 1).getActualMaximum(Calendar.DAY_OF_MONTH));
  }
}

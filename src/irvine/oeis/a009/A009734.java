package irvine.oeis.a009;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009734 Days in a one-month gym membership starting at n-th day of year [ days from Jan 01 to Feb 01, Jan 02 to Feb 02, ... <code>]</code>.
 * @author Sean A. Irvine
 */
public class A009734 implements Sequence {

  // Sequence does not specify if is a leap year
  // Also seems to start one day earlier than I would expect
  // Nevertheless this seems to reproduce the sequence.
  private final GregorianCalendar mCal = new GregorianCalendar(2000, Calendar.DECEMBER, 30);

  @Override
  public Z next() {
    mCal.add(Calendar.DAY_OF_MONTH, 1);
    final GregorianCalendar copy = (GregorianCalendar) mCal.clone();
    copy.add(Calendar.MONTH, 1);
    //SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    //System.out.println(f.format(mCal.getTime()) + " -> " + f.format(copy.getTime()));
    final long diff = copy.getTime().getTime() - mCal.getTime().getTime();
    final long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    return Z.valueOf(days);
  }
}

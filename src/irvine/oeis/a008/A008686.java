package irvine.oeis.a008;

import java.util.Calendar;
import java.util.GregorianCalendar;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008686.
 * @author Sean A. Irvine
 */
public class A008686 implements Sequence {

  private final GregorianCalendar mCal = new GregorianCalendar(2000, Calendar.DECEMBER, 25);

  @Override
  public Z next() {
    mCal.add(Calendar.DAY_OF_MONTH, 7);
    return Z.valueOf(mCal.get(Calendar.DAY_OF_MONTH));
  }
}

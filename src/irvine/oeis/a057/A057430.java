package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.time.BadiDate;

/**
 * A057430 Number of days in months of Baha'i calendar.
 * @author Sean A. Irvine
 */
public class A057430 implements Sequence {

  private static final Z Z19 = Z.valueOf(19);
  private int mYear = 174;
  private int mMonth = 0;

  @Override
  public Z next() {
    if (++mMonth == 21) {
      ++mYear;
      mMonth = 1;
    }
    if (mMonth != 20) {
      return Z19;
    }
    final BadiDate date1 = BadiDate.createFromBadiDate(mYear, 19, 1);
    final BadiDate date2 = BadiDate.createFromBadiDate(mYear, 20, 1);
    final int delta = date2.getGregorianDayOfYear() - date1.getGregorianDayOfYear();
    return Z.valueOf(delta);
  }
}

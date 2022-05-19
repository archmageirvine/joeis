package irvine.oeis.a056;

import java.time.Year;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056958 Number of days in months of Coptic calendar.
 * @author Sean A. Irvine
 */
public class A056958 implements Sequence {

  private static final Z Z30 = Z.valueOf(30);
  private long mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM <= 12) {
      return Z30;
    } else {
      mM = 0;
      return Year.isLeap(++mN) ? Z.SIX : Z.FIVE;
    }
  }
}

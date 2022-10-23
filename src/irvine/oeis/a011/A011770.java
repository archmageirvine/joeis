package irvine.oeis.a011;

import java.time.Year;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011770 Days per century for British calendar from first century, following Gregorian calendar after A.D. 1752.
 * @author Sean A. Irvine
 */
public class A011770 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // This evil sequence is days as recorded in the UK at the time?
    // It thus swaps from Julian to Gregorian in 1752
    if (mN < 1700) {
      mN += 100;
      return Z.valueOf(36525);
    }
    if (mN == 1700) {
      mN += 100;
      return Z.valueOf(36513); // Julian to Gregorian shift
    }
    long sum = 0;
    for (int k = 0; k < 100; ++k) {
      if (++mN > 0) {
        sum += Year.of(mN).length();
      }
    }
    return Z.valueOf(sum);
  }
}

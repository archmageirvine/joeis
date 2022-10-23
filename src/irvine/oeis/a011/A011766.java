package irvine.oeis.a011;

import java.time.Year;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011766 Number of days in A.D. years from 100*n through 100*n + 99.
 * @author Sean A. Irvine
 */
public class A011766 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    // This evil sequence is days as recorded in the UK at the time?
    // It thus swaps from Julian to Gregorian in 1752
    if (mN > 0 && mN < 1600) {
      mN += 100;
      return Z.valueOf(36525);
    }
    if (mN == 1699) {
      mN += 100;
      return Z.valueOf(36514); // Julian to Gregorian shift
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

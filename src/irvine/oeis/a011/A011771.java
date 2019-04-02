package irvine.oeis.a011;

import java.time.Year;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011771 Days per century for Roman calendar from first century, following Gregorian calendar after A.D. 1582.
 * @author Sean A. Irvine
 */
public class A011771 implements Sequence {

  // Cf. A011770.

  private int mN = 0;

  @Override
  public Z next() {
    if (mN < 1500) {
      mN += 100;
      return Z.valueOf(36525);
    }
    if (mN == 1500) {
      mN += 100;
      return Z.valueOf(36515); // Julian to Gregorian shift
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

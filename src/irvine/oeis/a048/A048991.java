package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048991 Write down the numbers 1,2,3,... but omit any number (such as 12 or 23 or 31 ...) which appears in the concatenation of all earlier terms.
 * @author Sean A. Irvine
 */
public class A048991 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    while (mA.indexOf(String.valueOf(++mN)) >= 0) {
      // do nothing
    }
    mA.append(mN);
    return Z.valueOf(mN);
  }
}


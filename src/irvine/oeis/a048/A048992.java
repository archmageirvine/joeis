package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048992 Hannah Rollman's numbers: the numbers excluded from A048991.
 * @author Sean A. Irvine
 */
public class A048992 implements Sequence {

  private final StringBuilder mA = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    while (mA.indexOf(String.valueOf(++mN)) < 0) {
      mA.append(mN);
    }
    return Z.valueOf(mN);
  }
}


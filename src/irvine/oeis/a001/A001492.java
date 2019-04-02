package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001492 Clock chimes with a quarter-hour bell.
 * @author Sean A. Irvine
 */
public class A001492 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 3) != 0) {
      return Z.ONE;
    } else {
      return Z.valueOf(((mN >> 2) - 1) % 12 + 1);
    }
  }
}

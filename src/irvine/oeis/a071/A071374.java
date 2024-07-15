package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A071374 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long m = mN;
    while ((m & 3) == 0) {
      m >>>= 2;
    }
    return (m & 7) == 7 ? Z.ZERO : Z.ONE;
  }
}

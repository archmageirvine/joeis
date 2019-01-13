package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001386.
 * @author Sean A. Irvine
 */
public class A001386 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Z.valueOf(mN).pow(3).shiftLeft(4).add(20 * mN).divide(3);
  }
}

package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000773.
 * @author Sean A. Irvine
 */
public class A000773 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int delta = (mN & 1) == 0 ? -1 : 1;
    return Z.ONE.shiftLeft(mN).add(delta).subtract(Z.THREE.pow((mN + 1) / 2)).divide(6);
  }
}

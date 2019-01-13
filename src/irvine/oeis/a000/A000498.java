package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000498.
 * @author Sean A. Irvine
 */
public class A000498 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    final long t = mN * (mN + 1L) / 2;
    return Z.ONE.shiftLeft(2 * mN)
      .subtract(Z.THREE.pow(mN).multiply(mN + 1))
      .add(Z.valueOf(t).shiftLeft(mN))
      .subtract(t * (mN - 1) / 3);
  }
}

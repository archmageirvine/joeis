package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060158 Number of permutations of [n] with 4 sequences.
 * @author Sean A. Irvine
 */
public class A060158 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN <= 4 ? Z.ZERO
      : Z.valueOf(2L * mN).subtract(7)
      .add(Z.valueOf(6 - mN).shiftLeft(mN - 1))
      .subtract(Z.THREE.pow(mN))
      .add(Z.ONE.shiftLeft(2 * (mN - 1)));
  }
}


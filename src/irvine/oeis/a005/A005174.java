package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005174 Number of trees of subsets of an n-set.
 * @author Sean A. Irvine
 */
public class A005174 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.FOUR.pow(mN).multiply(8).subtract(17).divide(3)
      .subtract(Z.THREE.pow(mN + 2))
      .add(Z.valueOf(11).shiftLeft(mN));
  }
}


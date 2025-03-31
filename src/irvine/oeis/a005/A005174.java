package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005174 Number of rooted trees with 4 nodes of disjoint sets of labels with union {1..n}. If a node has an empty set of labels then it must have at least two children.
 * @author Sean A. Irvine
 */
public class A005174 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.FOUR.pow(mN).multiply(8).subtract(17).divide(3)
      .subtract(Z.THREE.pow(mN + 2))
      .add(Z.valueOf(11).shiftLeft(mN));
  }
}


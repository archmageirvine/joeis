package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005175 Number of rooted trees with 5 nodes of disjoint sets of labels with union {1..n}. If a node has an empty set of labels then it must have at least two children.
 * @author Sean A. Irvine
 */
public class A005175 extends Sequence1 {

  private static final Q Q5 = new Q(125, 24);
  private static final Q Q4 = new Q(64, 3);
  private static final Q Q3 = new Q(135, 4);
  private static final Q Q2 = new Q(76, 3);
  private static final Q Q1 = new Q(209, 24);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Q5.multiply(Z.FIVE.pow(mN))
      .subtract(Q4.multiply(Z.FOUR.pow(mN)))
      .add(Q3.multiply(Z.THREE.pow(mN)))
      .subtract(Q2.multiply(Z.TWO.pow(mN)))
      .add(Q1).toZ();
  }
}


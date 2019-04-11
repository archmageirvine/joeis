package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005175 Number of trees of subsets of <code>an</code> n-set.
 * @author Sean A. Irvine
 */
public class A005175 implements Sequence {

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


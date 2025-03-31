package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a003.A003063;

/**
 * A005173 Number of rooted trees with 3 nodes of disjoint sets of labels with union {1..n}. If a node has an empty set of labels then it must have at least two children.
 * @author Sean A. Irvine
 */
public class A005173 extends A003063 {

  private Z mA = Z.ONE;
  {
    super.next();
  }

  @Override
  public Z next() {
    mA = mA.add(super.next());
    return mA;
  }
}

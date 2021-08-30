package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a309.A309858;

/**
 * A051240 Number of 4-uniform hypergraphs on n unlabeled nodes, or equivalently pure 3-dimensional simplicial complexes on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A051240 extends A309858 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 4);
  }
}

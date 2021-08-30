package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a309.A309858;

/**
 * A051249 Pure 4-dimensional simplicial complexes on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A051249 extends A309858 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 5);
  }
}

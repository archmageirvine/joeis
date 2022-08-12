package irvine.oeis.a058;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A058718 Number of nonisomorphic loopless matroids on n unlabeled points.
 * @author Sean A. Irvine
 */
public class A058718 extends A058716 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> t(mN, k));
  }
}

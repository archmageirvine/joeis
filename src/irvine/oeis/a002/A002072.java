package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002072.
 * @author Sean A. Irvine
 */
public class A002072 extends A002071 {

  @Override
  public Z next() {
    super.next();
    return mLargestSolution;
  }
}

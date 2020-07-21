package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033863.
 * @author Sean A. Irvine
 */
public class A033864 extends A033863 {

  @Override
  public Z next() {
    super.next();
    return mLeastSolutionValue.get(mN);
  }
}

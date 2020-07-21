package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033864 Sorted number reached from <code>A033863(n)</code> by <code>Sort-then-add</code>.
 * @author Sean A. Irvine
 */
public class A033864 extends A033863 {

  @Override
  public Z next() {
    super.next();
    return mLeastSolutionValue.get(mN);
  }
}

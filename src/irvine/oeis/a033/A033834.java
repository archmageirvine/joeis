package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033834 Number of proper factorizations of the numbers with a record number of proper factorizations.
 * @author Sean A. Irvine
 */
public class A033834 extends A033833 {

  @Override
  public Z next() {
    super.next();
    return mPrevBest.subtract(1);
  }
}

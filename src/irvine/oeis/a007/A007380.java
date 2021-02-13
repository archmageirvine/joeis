package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007380 Number of 5th-order maximal independent sets in path graph.
 * @author Sean A. Irvine
 */
public class A007380 extends A007381 {

  private long mN = 7;

  @Override
  public Z next() {
    return t(2, 7, ++mN);
  }
}

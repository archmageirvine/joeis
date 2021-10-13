package irvine.oeis.a348;

import irvine.math.z.Z;

/**
 * A348161 Number of factorizations of (n,n) into one or two pairs (i,j) with i &gt; 0, j &gt; 0 (and if i=1 then j=1).
 * @author Sean A. Irvine
 */
public class A348161 extends A348157 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}

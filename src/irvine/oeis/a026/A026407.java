package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026407 a(n) = greatest k such that s(j) &gt; 0 for all j &lt; k at end of stage n in forming A026409.
 * @author Sean A. Irvine
 */
public class A026407 extends A026409 {

  private long mN = 1;

  @Override
  public Z next() {
    super.step(mN);
    while (mMap.containsKey(mN)) {
      ++mN;
    }
    return Z.valueOf(mN - 1);
  }
}

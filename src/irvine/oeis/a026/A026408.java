package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026408 a(n) = s(k), where, at the end of stage n when forming A026409, k is the greatest integer such that s(j) &gt; 0 for all j &lt; k.
 * @author Sean A. Irvine
 */
public class A026408 extends A026409 {

  private long mN = 1;

  @Override
  public Z next() {
    super.step(mN);
    while (mMap.containsKey(mN)) {
      ++mN;
    }
    return Z.valueOf(mMap.get(mN - 1));
  }
}

package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026408 <code>a(n) = s(k)</code>, where, at the end of stage n when forming <code>A026409</code>, k is the greatest integer such that <code>s(j) &gt; 0</code> for all j &lt; k.
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

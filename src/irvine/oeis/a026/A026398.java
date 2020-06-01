package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026398 <code>a(n) =</code> greatest k such that <code>s(j) &gt; 0</code> for all j <code>&lt;</code> k at end of stage n in forming <code>A026400</code>.
 * @author Sean A. Irvine
 */
public class A026398 extends A026400 {

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

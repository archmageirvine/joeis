package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026155 <code>T(n,n-4)</code>, where T is the array in <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A026155 extends A026148 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, mN - 4);
  }
}

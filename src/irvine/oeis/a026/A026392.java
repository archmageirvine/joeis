package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026392 <code>T(n,[ n/2 ])</code>, where T is the array in <code>A026386</code>.
 * @author Sean A. Irvine
 */
public class A026392 extends A026386 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}

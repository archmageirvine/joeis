package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026621 <code>T(n,[ n/2 ])</code>, T given by <code>A026615</code>.
 * @author Sean A. Irvine
 */
public class A026621 extends A026615 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}

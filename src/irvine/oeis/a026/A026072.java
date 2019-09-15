package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024996;

/**
 * A026072 <code>a(n) = T(2n-1,n)</code>, where T is the array defined in <code>A024996</code>.
 * @author Sean A. Irvine
 */
public class A026072 extends A024996 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN).max(Z.ONE);
  }
}


package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047904 a(n+1) = a(n) + n (if n is odd), a(n+1) = a(n) * n (if n is even).
 * @author Sean A. Irvine
 */
public class A047904 implements Sequence {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : ((++mN & 1) == 0 ? mA.multiply(mN) : mA.add(mN));
    return mA;
  }
}

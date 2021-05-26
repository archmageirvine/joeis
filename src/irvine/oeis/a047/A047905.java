package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047905 a(n+1) = a(n) + n (if n is even), a(n+1) = a(n) * n (if n is odd).
 * @author Sean A. Irvine
 */
public class A047905 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    mA = (++mN & 1) == 1 ? mA.multiply(mN) : mA.add(mN);
    return mA;
  }
}

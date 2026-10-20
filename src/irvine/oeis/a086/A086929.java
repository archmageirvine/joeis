package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086929 a(1) = 1, a(n) = n times (the digit reversal of the (n-1)-th partial sum).
 * @author Sean A. Irvine
 */
public class A086929 extends Sequence1 {

  private Z mSum = Z.ONE;
  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    mA = Functions.REVERSE.z(mSum).multiply(mN);
    mSum = mSum.add(mA);
    return mA;
  }
}

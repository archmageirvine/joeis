package irvine.oeis.a337;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A337770 a(0)=1; a(n) is the leading digit of a(n-1) multiplied by n concatenated with the remaining digits of a(n-1).
 * @author Georg Fischer
 */
public class A337770 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mA;
    }
    final String str = mA.toString();
    mA = new Z((str.charAt(0) - '0') * mN + str.substring(1));
    return mA;
  }
}

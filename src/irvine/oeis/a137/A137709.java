package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.a001.A001950;

/**
 * A137709 Secondary Upper Wythoff Sequence.
 * @author Georg Fischer
 */
public class A137709 extends A001950 {

  private int mN = 0;
  private Z mA;

  @Override
  public Z next() {
    // a(2n)=2*A001950(n)=a(2n-1)+1;
    ++mN;
    if ((mN & 1) == 1) {
      mA = super.next().multiply2();
      return mA.subtract(1);
    }
    return mA;
  }
}

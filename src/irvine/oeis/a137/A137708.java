package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A137708 Secondary Lower Wythoff Sequence.
 * @author Georg Fischer
 */
public class A137708 extends A000201 {

  private int mN = 0;
  private Z mA;

  @Override
  public Z next() {
    // a(2n)=2*A000201(n)=a(2n-1)+1;
    ++mN;
    if ((mN & 1) == 1) {
      mA = super.next().multiply2();
      return mA.subtract(1);
    }
    return mA;
  }
}

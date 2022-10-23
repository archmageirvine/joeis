package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061681 a(0)=1; a(n) = a(n-1) + lead(a(n-1)) for n &gt; 0 where for an integer x lead(x) is the leading digit in base 10.
 * @author Georg Fischer
 */
public class A061681 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mA;
    }
    mA = mA.add(new Z(mA.toString().substring(0, 1)));
    return mA;
  }
}

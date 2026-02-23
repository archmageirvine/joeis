package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387786 a(0)=2, a(1)=1, and thereafter a(n) = R(a(n-1) + a(n-2)) where R(x) = A004086(x) is the decimal digit reversal of x.
 * @author Sean A. Irvine
 */
public class A387786 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = Functions.REVERSE.z(mA.add(mB));
    mA = mB;
    mB = t;
    return t;
  }
}


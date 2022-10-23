package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004119 a(0)=1; thereafter a(n) = 3*2^(n-1)+1.
 * @author Sean A. Irvine
 */
public class A004119 extends Sequence0 {

  private boolean mFirst = true;
  private Z mA = Z.THREE;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    final Z res = mA.add(1);
    mA = mA.multiply2();
    return res;
  }
}

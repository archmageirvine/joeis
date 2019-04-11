package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004119 <code>a(0)=1</code>; thereafter <code>a(n) = 3*2^(n-1)+1</code>.
 * @author Sean A. Irvine
 */
public class A004119 implements Sequence {

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

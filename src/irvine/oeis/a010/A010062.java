package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010062 a(0)=1; thereafter a(n+1) = a(n) + number of 1's in binary representation of a(n).
 * @author Sean A. Irvine
 */
public class A010062 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(mA.bitCount());
    return mA;
  }
}


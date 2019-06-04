package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053337 <code>a(n)</code> contains n digits (either <code>'6'</code> or <code>'7')</code> and is divisible by <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A053337 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply(6).add(mA);
    if (Z.ZERO.equals(a.mod(mT))) {
      mA = a;
    } else {
      mA = mS.multiply(7).add(mA);
    }
    return mA;
  }
}

package irvine.oeis.a242;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A242350 Multiply a(n-1) by 2 and drop all 0's.
 * @author Georg Fischer
 */
public class A242350 implements Sequence {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z result = mA;
    mA = new Z(mA.multiply2().toString().replace("0", ""));
    return result;

  }
}

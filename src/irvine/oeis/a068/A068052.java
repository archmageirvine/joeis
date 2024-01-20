package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068052 Start from 1, shift one left and sum mod 2 (bitwise-XOR) to get 3 (11 in binary), then shift two steps left and XOR to get 15 (1111 in binary), then three steps and XOR to get 119 (1110111 in binary), then four steps and so on.
 * @author Sean A. Irvine
 */
public class A068052 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.shiftLeft(mN).xor(mA);
    }
    return mA;
  }
}


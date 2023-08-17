package irvine.oeis.a089;
// manually robots/union2 at 2023-08-15 15:43

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A089648 Numbers whose numbers of zeros and ones in binary representation differ at most by 1.
 * @author Georg Fischer
 */
public class A089648 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Math.abs(mN.bitCount() * 2 - mN.bitLength()) <= 1) {
        return mN;
      }
    }
  }
}

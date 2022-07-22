package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A164344 Positive integers whose square contains the same number of 0's as 1's when represented in binary.
 * @author Sean A. Irvine
 */
public class A164344 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if ((s.bitLength() & 1) == 0 && 2 * s.bitCount() == s.bitLength()) {
        return mN;
      }
    }
  }
}


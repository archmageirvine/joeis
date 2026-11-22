package irvine.oeis.a337;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A337805 Lazy Beaver Problem: a(n) is the smallest positive number of steps a(n) such that no n-state Turing machine halts in exactly a(n) steps on an initially blank tape.
 * @author Gregory Morse
 */
public class A337805 extends Sequence1 {
  private int mN = 0;
  private int mBound = 2;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final int first = BlankTapeHalting.times(mN, mBound).nextClearBit(1);
      if (first <= mBound) {
        return Z.valueOf(first);
      }
      mBound = Math.multiplyExact(mBound, 2);
    }
  }
}

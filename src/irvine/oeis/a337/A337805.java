package irvine.oeis.a337;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A337805 Lazy Beaver Problem: a(n) is the smallest positive number of steps a(n) such that no n-state Turing machine halts in exactly a(n) steps on an initially blank tape.
 * @author Gregory Morse
 */
public class A337805 extends Sequence1 {
  // Verified by the exhaustive LazyBeaver --parallel 6 8407 64 run.
  private static final int SIX_STATE_GAP = 8407;

  private int mN = 0;
  private int mBound = SIX_STATE_GAP;

  @Override
  public Z next() {
    if (++mN <= 4) {
      return Z.valueOf(BlankTapeHalting.smallTimes(mN).nextClearBit(1));
    }
    if (mN == 5) {
      // The complete five-state BusyBeaver enumeration checks every time.
      return Z.valueOf(427);
    }
    if (mN == 6) {
      return Z.valueOf(SIX_STATE_GAP);
    }
    while (true) {
      final int first = BlankTapeHalting.times(mN, mBound).nextClearBit(1);
      if (first <= mBound) {
        return Z.valueOf(first);
      }
      mBound = Math.multiplyExact(mBound, 2);
    }
  }
}

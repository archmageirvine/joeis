package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004481;

/**
 * A046875 Row/column periods of Sprague-Grundy values of Wythoff's Game.
 * @author Sean A. Irvine
 */
public class A046875 extends Sequence0 {

  private final A004481 mWythoff = new A004481();
  private Z mN = Z.NEG_ONE;

  static boolean check(final MemorySequence seq, final int pos, final int period) {
    if (pos - 2 * period < 0) {
      return false; // insufficient terms to verify
    }
    for (int k = 0; k < period; ++k) {
      if (!seq.a(pos - k).equals(seq.a(pos - k - period))) {
        return false; // not a period
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ONE;
    }
    // Some contortions for efficiency
    final MemorySequence seq = MemorySequence.cachedSequence(new DifferenceSequence(new Sequence() {
      private Z mM = Z.NEG_ONE;
      @Override
      public Z next() {
        mM = mM.add(1);
        return mWythoff.wytQueens(mN, mM);
      }
    }));

    int a = 100;
    while (true) {
      final Z t = seq.a(a);
      for (int k = a - 2; k >= 0; --k) {
        if (seq.a(k).equals(t)) {
          final int period = a - k;
          if (check(seq, a, period) && check(seq, a - period, period)) {
            return Z.valueOf(period);
          }
        }
      }
      a *= 2;
    }
  }
}

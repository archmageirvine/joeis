package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004481;

/**
 * A046874 Row/column pre-periods of Sprague-Grundy values of Wythoff's Game.
 * @author Sean A. Irvine
 */
public class A046874 extends Sequence0 {

  private final A004481 mWythoff = new A004481();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ZERO;
    }
    // Some contortions for efficiency
    final MemorySequence seq = MemorySequence.cachedSequence(new DifferenceSequence(new Sequence0() {
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
          if (A046875.check(seq, a, period) && A046875.check(seq, a - period, period)) {
            while (k >= period && seq.a(k).equals(seq.a(k - period))) {
              --k;
            }
            return Z.valueOf(k - period + 1);
          }
        }
      }
      a *= 2;
    }
  }
}

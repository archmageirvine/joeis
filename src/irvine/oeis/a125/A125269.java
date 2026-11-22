package irvine.oeis.a125;

import java.util.BitSet;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060843;

/**
 * A125269 Minimal number of states required for a 2-symbol, 5-tuple Turing machine that takes n steps on an initially blank tape before halting.
 * @author Gregory Morse
 */
public class A125269 extends Sequence1 {
  private final A060843 mBusyBeaver = new A060843();
  private final BitSet[] mTimes = new BitSet[5];
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (int states = 1; states < mTimes.length; ++states) {
      if (mTimes[states] == null) {
        mTimes[states] = BlankTapeHalting.times(states, mBusyBeaver.a(states).intValueExact());
      }
      if (mTimes[states].get(mN)) {
        return Z.valueOf(states);
      }
    }
    for (int states = mTimes.length; states < mN; ++states) {
      if (BlankTapeHalting.attainable(states, mN)) {
        return Z.valueOf(states);
      }
    }
    return Z.valueOf(mN);
  }
}

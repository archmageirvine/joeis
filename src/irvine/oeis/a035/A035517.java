package irvine.oeis.a035;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A035517 Triangular array read by rows, formed from Zeckendorf expansion of integers: repeatedly subtract the largest Fibonacci number you can until nothing remains. Row n give Z. expansion of n.
 * @author Sean A. Irvine
 */
public class A035517 extends Sequence0 {

  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private final List<Z> mA = new ArrayList<>();
  private Z mN = Z.NEG_ONE;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mN = mN.add(1);
      if (mN.isZero()) {
        return Z.ZERO;
      }
      mA.clear();
      int k = 1;
      while (mFibo.a(k).compareTo(mN) <= 0) {
        ++k;
      }
      Z m = mN;
      while (!m.isZero()) {
        final Z f = mFibo.a(k);
        if (f.compareTo(m) > 0) {
          --k;
        } else {
          mA.add(f);
          m = m.subtract(f);
        }
      }
      mM = mA.size() - 1;
    }
    return mA.get(mM);
  }
}


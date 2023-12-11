package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002212;
import irvine.oeis.a039.A039658;
import irvine.oeis.a039.A039660;
import irvine.oeis.a039.A039919;
import irvine.oeis.a055.A055879;
import irvine.oeis.memory.MemorySequence;

/**
 * A045907 Catafusenes (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A045907 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A002212());
  private final MemorySequence mM = MemorySequence.cachedSequence(new PrependSequence(new A055879(), 0));
  private final MemorySequence mMPrime = MemorySequence.cachedSequence(new PrependSequence(new A039919(), 0));
  private final MemorySequence mL = MemorySequence.cachedSequence(new PrependSequence(new A039658(), 0));
  private final MemorySequence mLPrime = MemorySequence.cachedSequence(new PrependSequence(new A039660(), 0));
  private int mN = -1;

  private Z mp(final int n) {
    // Sequence only has half the terms (0, 1, 5, 21 rather than 0, 0, 1, 1, 5, 5, 21, 21)
    return mMPrime.a((n + 1) / 2);
  }

  @Override
  public Z next() {
    // M(n) + (N(n/2) + L(n) - L(n/2) + L'(n))/2 - M(n/2) + M'(n)
    ++mN;
    Z t = mL.a(mN).add(mLPrime.a(mN));
    if ((mN & 1) == 0) {
      t = t.add(mA.a(mN / 2)).subtract(mL.a(mN / 2));
    }
    t = t.divide2();
    t = t.add(mM.a(mN)).add(mp(mN));
    if ((mN & 1) == 0) {
      t = t.subtract(mM.a(mN / 2));
    }
    return t;
  }
}

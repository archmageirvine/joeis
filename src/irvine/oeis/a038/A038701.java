package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000961;
import irvine.oeis.a003.A003418;
import irvine.oeis.a008.A008475;
import irvine.oeis.a051.A051703;
import irvine.oeis.memory.MemorySequence;

/**
 * A038701 Prime powers q for which f(g(m(q))) = m(q), where f = A051703, g = A008475 and m = A003418.
 * @author Sean A. Irvine
 */
public class A038701 extends A000961 {

  private final Sequence mM = new A003418();
  private final MemorySequence mG = MemorySequence.cachedSequence(new PrependSequence(new A008475(), 0));
  private final MemorySequence mF = MemorySequence.cachedSequence(new A051703());
  private int mMIndex = -1;
  {
    next(); // skip 1
  }

  private int getM(final int q) {
    while (++mMIndex < q) {
      mM.next();
    }
    return mM.next().intValueExact();
  }

  @Override
  public Z next() {
    while (true) {
      final int q = super.next().intValueExact();
      final int m = getM(q);
      if (mF.a(mG.a(m).intValueExact()).intValueExact() == m) {
        return Z.valueOf(q);
      }
    }
  }
}

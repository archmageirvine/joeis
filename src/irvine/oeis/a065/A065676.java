package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007305;
import irvine.oeis.a047.A047679;
import irvine.oeis.memory.MemorySequence;

/**
 * A065658.
 * @author Sean A. Irvine
 */
public class A065676 extends Sequence1 {

  private int mN = -1;
  private final MemorySequence mSternBrocotNum = MemorySequence.cachedSequence(new A007305().skip(2));
  private final MemorySequence mSternBrocotDen = MemorySequence.cachedSequence(new A047679());

  private long expOf2(final Q t) {
    return t.num().makeOdd().auxiliary() - t.den().makeOdd().auxiliary();
  }

  @Override
  public Z next() {
    return Z.valueOf(expOf2(new Q(mSternBrocotNum.a(++mN), mSternBrocotDen.a(mN))));
  }
}

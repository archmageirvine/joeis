package irvine.oeis.a067;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000204;
import irvine.oeis.memory.MemorySequence;

/**
 * A067979 Triangle read by rows of incomplete convolutions of Lucas numbers L(n+1) = A000204(n+1), n&gt;=0.
 * @author Sean A. Irvine
 */
public class A067979 extends Sequence0 {

  private final MemorySequence mL = MemorySequence.cachedSequence(new A000204());
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mM, k -> mL.a(k).multiply(mL.a(mN - k)));
  }
}


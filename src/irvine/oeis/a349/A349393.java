package irvine.oeis.a349;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a126.A126760;

/**
 * A349393 Inverse M\u00f6bius transform of A126760.
 * @author Georg Fischer
 */
public class A349393 extends Sequence1 {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A126760());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(d));
  }
}

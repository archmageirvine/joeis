package irvine.oeis.a347;

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a126.A126760;

/**
 * A347233 M\u00f6bius transform of A126760.
 * @author Georg Fischer
 */
public class A347233 extends Sequence1 {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A126760());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(d).multiply(Mobius.mobius(mN / d)));
  }
}

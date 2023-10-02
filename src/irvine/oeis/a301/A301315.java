package irvine.oeis.a301;

import java.util.function.BiFunction;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A301315.
 * @author Sean A. Irvine
 */
public class A301315 extends Sequence1 {

  private final BiFunction<Z, Integer, Z> mB = new BiFunction<>() {
    @Override
    public Z apply(final Z p, final Integer e) {
      return Puma.primeZ(p).pow(mSeq.a(e));
    }
  };
  private final MemorySequence mSeq = MemorySequence.cachedSequence(new MultiplicativeSequence(1, mB));
  {
    mSeq.add(null); // 0 unused
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}

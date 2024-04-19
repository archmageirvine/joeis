package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A051999 Minimal value w such that A051953(w) = w - phi(w) is prime and w has n prime divisors.
 * @author Sean A. Irvine
 */
public class A051999 extends Sequence1 {

  private final MemorySequence mSeq = new MemorySequence() {
    private final Sequence mA = new A051953();
    private long mN = 0;

    @Override
    protected Z computeNext() {
      ++mN;
      final Z t = mA.next();
      return Z.valueOf(!t.isProbablePrime() ? 0 : Functions.OMEGA.i(mN));
    }
  };
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    int m = 0;
    while (!mN.equals(mSeq.a(++m))) {
      // do nothing
    }
    return Z.valueOf(m + 1);
  }
}

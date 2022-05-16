package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A051999 Minimal value w such that A051953(w) = w - phi(w) is prime and w has n prime divisors.
 * @author Sean A. Irvine
 */
public class A051999 implements Sequence {

  private MemorySequence mSeq = new MemorySequence() {
    private final Sequence mA = new A051953();
    private long mN = 0;

    @Override
    protected Z computeNext() {
      ++mN;
      final Z t = mA.next();
      return Z.valueOf(!t.isProbablePrime() ? 0 : Jaguar.factor(mN).omega());
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

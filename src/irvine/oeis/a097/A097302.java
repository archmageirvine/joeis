package irvine.oeis.a097;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A097302 Denominators of rationals used in the Euler-Maclaurin type derivation of Stirling's formula for N!.
 * @author Georg Fischere
 */
public class A097302 extends Sequence0 {

  private int mN = -1;
  private final BernoulliSequence mBSeq = new BernoulliSequence(0);

  {
    mBSeq.nextQ();
    mBSeq.nextQ();
  }

  @Override
  public Z next() {
    // a(n)=denominator(B(n)) with B(n):=Bernoulli(2*n+2)*(2*n)!/(2*n+2)
    ++mN;
    final Z result = mBSeq.nextQ().multiply(MemoryFactorial.SINGLETON.factorial(mN)).divide(mN + 2).den();
    ++mN;
    mBSeq.nextQ();
    return result;
  }
}

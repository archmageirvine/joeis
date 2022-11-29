package irvine.oeis.a097;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A097301 Numerators of rationals used in the Euler-Maclaurin type derivation of Stirling's formula for N!.
 * @author Georg Fischere
 */
public class A097301 extends Sequence0 {

  private int mN = -1;
  private final BernoulliSequence mBSeq = new BernoulliSequence(0);

  {
    mBSeq.nextQ();
    mBSeq.nextQ();
  }

  @Override
  public Z next() {
    // seq(numer(bernoulli(2*n+2)*(2*n)!/(2*n+2)), n=0..10);
    ++mN;
    final Z result = mBSeq.nextQ().multiply(MemoryFactorial.SINGLETON.factorial(mN)).divide(mN + 2).num();
    ++mN;
    mBSeq.nextQ();
    return result;
  }
}

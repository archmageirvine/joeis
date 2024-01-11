package irvine.oeis.a067;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.CachedSequence;

/**
 * A067857 Sum_{k|n} a(k)/k! = Sum_{j=1 to n} 1/j, sum on left is over positive divisors k of n.
 * @author Sean A. Irvine
 */
public class A067857 extends CachedSequence {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private static final HarmonicSequence H = new HarmonicSequence();

  /** Construct the sequence. */
  public A067857() {
    super(1, Integer.class, (self, n) -> H.nextQ()
      .subtract(Rationals.SINGLETON.sumdiv(n, k -> k.equals(n) ? Q.ZERO : new Q(self.a(k), F.factorial(k))))
      .multiply(F.factorial(n)).toZ());
  }
}

package irvine.oeis.a065;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A065106 Smallest Fibonacci index to produce a factor p^2 (for primes p).
 * @author Sean A. Irvine
 */
public class A065106 extends Sequence1 {

  private long mN = 2;
  private final Sequence mFibonacci = new A000045().skip(3);
  private final HashSet<Z> mSeen = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final FactorSequence fs = Jaguar.factor(mFibonacci.next());
      for (final Z p : fs.toZArray()) {
        if (!mSeen.contains(p) && fs.getExponent(p) > 1) {
          mSeen.add(p);
          return Z.valueOf(mN);
        }
      }
    }
  }
}

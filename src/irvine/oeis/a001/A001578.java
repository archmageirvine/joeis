package irvine.oeis.a001;

import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001578 Smallest primitive prime factor of Fibonacci number F(n), or 1 if F(n) has no primitive prime factor.
 * @author Sean A. Irvine
 */
public class A001578 extends Sequence1 {

  private int mN = 0;
  private final HashSet<Z> mPrimitives = new HashSet<>();

  @Override
  public Z next() {
    final Z f = Fibonacci.fibonacci(++mN);
    final FactorSequence fs = Jaguar.factor(f);
    final Z[] factors = fs.toZArray();
    for (final Z p : factors) {
      if (Z.ONE.equals(p)) {
        return p;
      }
      if (!mPrimitives.contains(p)) {
        mPrimitives.addAll(Arrays.asList(factors));
        return p;
      }
    }
    return Z.ONE;
  }
}

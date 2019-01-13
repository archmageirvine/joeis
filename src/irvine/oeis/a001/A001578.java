package irvine.oeis.a001;

import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001578.
 * @author Sean A. Irvine
 */
public class A001578 implements Sequence {

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
      if (!p.isProbablePrime()) {
        throw new UnsupportedOperationException();
      }
      if (!mPrimitives.contains(p)) {
        mPrimitives.addAll(Arrays.asList(factors));
        return p;
      }
    }
    return Z.ONE;
  }
}

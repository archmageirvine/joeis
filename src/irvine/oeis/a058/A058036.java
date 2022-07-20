package irvine.oeis.a058;

import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A058036 Smallest primitive prime factor of the n-th Lucas number (A000032); i.e., L(n), L(0) = 2, L(1) = 1 and L(n) = L(n-1) + L(n-2).
 * @author Sean A. Irvine
 */
public class A058036 extends A000032 {

  private final HashSet<Z> mPrimitives = new HashSet<>();

  @Override
  public Z next() {
    final Z lucas = super.next();
    final FactorSequence fs = Jaguar.factor(lucas);
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

package irvine.math.predicate;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is practical.
 * @author Sean A. Irvine
 */
class Practical extends AbstractPredicate {

  @Override
  public boolean is(final long n) {
    if ((n & (n - 1)) == 0) {
      return true; // Powers of 2 are members
    }
    if ((n & 1) == 1) {
      return false; // All other terms are even
    }
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] fn = fs.toZArray();
    Arrays.sort(fn);
    Z p = Z.ONE;
    for (int k = 1; k < fn.length; ++k) {
      final Z sigma = Functions.SIGMA.z(fn[k - 1].pow(fs.getExponent(fn[k - 1])));
      p = p.multiply(sigma);
      if (fn[k].compareTo(p.add(1)) > 0) {
        return false;
      }
    }
    return true;
  }
}

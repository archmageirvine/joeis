package irvine.math.predicate;

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
    // Anything we can fit in a long we can completely factor
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] fn = fs.toZArray();
    Z p = Z.ONE;
    for (int k = 1; k < fn.length; ++k) {
      final Z sigma = Functions.SIGMA1.z(fn[k - 1].pow(fs.getExponent(fn[k - 1])));
      p = p.multiply(sigma);
      if (fn[k].compareTo(p.add(1)) > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean is(final Z n) {
    // Powers of 2 are practical
    if (n.bitCount() == 1) {
      return true;
    }
    // Practical numbers > 1 must be even
    if (n.testBit(0)) {
      return false;
    }

    // Allow incomplete factorization
    final FactorSequence fs = Jaguar.factorAllowIncomplete(n);
    final Z[] fn = fs.toZArray();
    Z p = Z.ONE; // Accumulator for sigma(prefix)
    for (final Z f : fn) {
      final Z nextLimit = p.add(Z.ONE);
      // If the factor exceeds sigma(prefix) + 1, it violates the prime gap inequality
      if (f.compareTo(nextLimit) > 0) {
        final int status = fs.getStatus(f);
        if (status == FactorSequence.PRIME || status == FactorSequence.PROB_PRIME) {
          // Guaranteed non-practical because this prime gap is too large
          return false;
        } else {
          // We cannot determine if 'f' splits into smaller primes that might satisfy the bound
          throw new UnsupportedOperationException("Incomplete factorization: factor " + f + " status unknown/composite");
        }
      }
      // Since f <= p + 1, whether f is prime or composite, its presence cannot break
      // practicality for this step or any sub-factors.
      final int e = fs.getExponent(f);
      final int status = fs.getStatus(f);
      if (status == FactorSequence.PRIME || status == FactorSequence.PROB_PRIME) {
        // Fully known prime: calculate exact sigma(f^e)
        final Z sigmaPk = Functions.SIGMA1.z(f.pow(e));
        p = p.multiply(sigmaPk);
      } else {
        // Unproven/composite component f where f <= p + 1:
        // Even in the worst-case lower bound where f acts as a prime of power 1,
        // its divisor sum contribution is at least (f + 1).
        p = p.multiply(f.add(Z.ONE));
      }
    }
    return true;
  }
}

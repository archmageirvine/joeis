package irvine.oeis.a071;

import java.util.function.BiFunction;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;

/**
 * A071574 If n = k-th prime, a(n) = 2*a(k) + 1; if n = k-th nonprime, a(n) = 2*a(k).
 * @author Sean A. Irvine
 */
public class A071574 extends CachedSequence {

  private static final Fast PRIME = new Fast();

  private static BiFunction<DirectSequence, Z, Z> create() {
    return new BiFunction<>() {
      private int mM = 1;

      @Override
      public Z apply(final DirectSequence self, final Z n) {
        if (Z.ONE.equals(n)) {
          return Z.ZERO;
        } else if (PRIME.isPrime(n)) {
          return self.a(Functions.PRIME_PI.i(n)).multiply2().add(1);
        } else {
          return self.a(++mM).multiply2();
        }
      }
    };
  }

  /** Construct the sequence. */
  public A071574() {
    super(1, create());
  }
}


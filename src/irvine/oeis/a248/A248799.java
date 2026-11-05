package irvine.oeis.a248;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A248799 Prime numbers p such that p^3 is an interprime = average of two successive primes.
 * @author Sean A. Irvine
 */
public class A248799 extends FilterSequence {

  /** Construct the sequence. */
  public A248799() {
    super(1, new A000040(), p -> {
      final Z p3 = p.pow(3);
      return Functions.PREV_PRIME.z(p3).add(Functions.NEXT_PRIME.z(p3)).equals(p3.multiply2());
    });
  }
}


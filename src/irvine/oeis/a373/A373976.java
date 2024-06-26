package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-26/lambdan at 2024-06-26 17:12

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A373976 a(n) = A001222(n) - A001222(A001414(n)), where A001222 is bigomega, the number of prime factors with multiplicity, and A001414 is sopfr, sum of prime factors with multiplicity. a(1) = 0 by convention.
 * @author Georg Fischer
 */
public class A373976 extends LambdaSequence {

  /** Construct the sequence. */
  public A373976() {
    super(1, n -> Functions.BIG_OMEGA.z(n).subtract(Functions.BIG_OMEGA.z(Functions.SOPFR.z(n))));
  }
}

package irvine.oeis.a365;
// Generated by gen_seq4.pl 2024-11-18.ack/lambdan at 2024-11-18 18:53

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365554 Number of increasing paths from the bottom to the top of the n-hypercube (as a graded poset) which first encounter a vector of isolated zeros at stage k, weighted by k.
 * @author Georg Fischer
 */
public class A365554 extends LambdaSequence {

  /** Construct the sequence. */
  public A365554() {
    super(2, n -> Integers.SINGLETON.sum(n / 2, n - 1, k -> Z.valueOf(k).multiply(Binomial.binomial(k + 1, n - k).subtract(Binomial.binomial(k - 1, n - k))).multiply(Functions.FACTORIAL.z(k).multiply(Functions.FACTORIAL.z(n - k)))));
  }
}

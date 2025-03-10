package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A379445 a(n) = gpf(prime(n)-1)*gpf(prime(n)+1), where gpf is A006530.
 * @author Georg Fischer
 */
public class A379445 extends LambdaSequence {

  /** Construct the sequence. */
  public A379445() {
    super(2, n -> Functions.GPF.z(Functions.PRIME.z(n).subtract(1)).multiply(Functions.GPF.z(Functions.PRIME.z(n).add(1))));
  }
}

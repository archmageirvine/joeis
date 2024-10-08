package irvine.oeis.a271;
// Generated by gen_seq4.pl 2024-10-06.ack/lambdan at 2024-10-06 22:12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a023.A023416;

/**
 * A271479 Number of steps for the trajectory of n under the map k -&gt; A271478(k) to reach 1.
 * @author Georg Fischer
 */
public class A271479 extends LambdaSequence {

  private static final DirectSequence A023416 = new A023416();

  /** Construct the sequence. */
  public A271479() {
    super(1, n -> (n <= 2) ? Z.valueOf(n - 1) : Functions.DIGIT_SUM.z(2, n - 1).add(Z.THREE.multiply(A023416.a(n - 1))));
  }
}

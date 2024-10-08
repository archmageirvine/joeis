package irvine.oeis.a154;
// Generated by gen_seq4.pl 2024-09-11.ack/parmof3 at 2024-09-11 23:28

import irvine.math.z.Z;
import irvine.oeis.a086.A086122;

/**
 * A154619 Primes of the form (4k^2 + 4k - 5)/5.
 * @author Georg Fischer
 */
public class A154619 extends A086122 {

  /** Construct the sequence. */
  public A154619() {
    super(1, k -> Z.valueOf(k).square().multiply(4).add(4L * k - 5), 5);
  }
}

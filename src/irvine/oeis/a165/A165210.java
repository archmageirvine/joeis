package irvine.oeis.a165;
// Generated by gen_seq4.pl 2024-09-11.ack/parmof3 at 2024-09-11 23:28

import irvine.math.z.Z;
import irvine.oeis.a086.A086122;

/**
 * A165210 Primes of the form (6^m - 1)/5.
 * @author Georg Fischer
 */
public class A165210 extends A086122 {

  /** Construct the sequence. */
  public A165210() {
    super(1, k -> Z.SIX.pow(k).subtract(1), 5);
  }
}

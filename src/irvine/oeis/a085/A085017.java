package irvine.oeis.a085;
// Generated by gen_seq4.pl 2024-11-05.ack/filnum at 2024-11-05 20:37

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085017 Reverse(Prime(n)) concatenated with Prime(n) (a palindrome) is divisible by n.
 * @author Georg Fischer
 */
public class A085017 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085017() {
    super(0, 1, k -> {
      final Z p = Functions.PRIME.z(k);
      return new Z(Functions.REVERSE.z(p).toString() + Functions.PRIME.z(k).toString()).mod(k) == 0;
    });
  }
}

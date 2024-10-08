package irvine.oeis.a340;
// Generated by gen_seq4.pl 2024-10-06.ack/lambdan at 2024-10-06 22:12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A340317 (Product of primes &lt;= n) read modulo n.
 * @author Georg Fischer
 */
public class A340317 extends LambdaSequence {

  /** Construct the sequence. */
  public A340317() {
    super(1, n -> (n <= 1) ? Z.ZERO : Functions.PRIMORIAL.z(n).modZ(n));
  }
}

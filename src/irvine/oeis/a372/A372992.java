package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-03-07.ack/lambdan at 2025-03-07 21:14

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A372992 a(n) = (n!)!/((n-1)!)!.
 * @author Georg Fischer
 */
public class A372992 extends LambdaSequence {

  /** Construct the sequence. */
  public A372992() {
    super(0, n -> n == 0 ? Z.ONE : Integers.SINGLETON.product(Functions.FACTORIAL.i(n - 1) + 1, Functions.FACTORIAL.i(n), Z::valueOf));
  }
}

package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-08-27.ack/lambdan at 2024-08-27 22:38

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A374662 a(n) = (1/2)*Product_{k=0..n} (F(k)+2), where F=A000045 (Fibonacci numbers).
 * @author Georg Fischer
 */
public class A374662 extends LambdaSequence {

  /** Construct the sequence. */
  public A374662() {
    super(0, n -> Integers.SINGLETON.product(0, n, k -> Functions.FIBONACCI.z(k).add(2)).divide(2));
  }
}

package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-08-18.ack/lambdan at 2024-08-18 22:15

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A374986 a(n) = (1/5)*Product_{k=0..n} F(k)+5, where F=A000045 (Fibonacci numbers).
 * @author Georg Fischer
 */
public class A374986 extends LambdaSequence {

  /** Construct the sequence. */
  public A374986() {
    super(0, n -> Integers.SINGLETON.product(0, n, k -> Functions.FIBONACCI.z(k).add(5)).divide(5));
  }
}

package irvine.oeis.a253;
// Generated by gen_seq4.pl 2024-09-12.ack/lambdan at 2024-09-12 20:55

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a004.A004526;

/**
 * A253275 a(n) = Sum_{i=1..floor(n/2)} d( i*(n-i) ), where d(n) = the number of divisors of n.
 * @author Georg Fischer
 */
public class A253275 extends LambdaSequence {

  private static final DirectSequence A004526 = new A004526();

  /** Construct the sequence. */
  public A253275() {
    super(1, n -> Integers.SINGLETON.sum(1, A004526.a(n).intValueExact(), i -> Functions.SIGMA0.z(i * (n - i))));
  }
}

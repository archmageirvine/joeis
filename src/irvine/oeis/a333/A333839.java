package irvine.oeis.a333;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a013.A013632;
import irvine.oeis.a049.A049711;

/**
 * A333839 a(n) = Sum_{k = 4..n} ((prevprime(k) + nextprime(k))/2 - k).
 * @author Georg Fischer
 */
public class A333839 extends LambdaSequence {

  private static final DirectSequence A013632 = new A013632();
  private static final DirectSequence A049711 = new A049711();

  /** Construct the sequence. */
  public A333839() {
    super(4, n -> Integers.SINGLETON.sum(4, n, k -> A013632.a(k).subtract(A049711.a(k)).divide(2)));
  }
}

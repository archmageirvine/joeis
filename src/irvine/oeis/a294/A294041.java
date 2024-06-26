package irvine.oeis.a294;
// Generated by gen_seq4.pl 2024-03-30/tuptraf at 2024-03-30 20:29

import irvine.oeis.a000.A000312;
import irvine.oeis.a056.A056040;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A294041 a(n) = lcm(n^n, factorial(n)/factorial(floor(n/2))^2).
 * @author Georg Fischer
 */
public class A294041 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A294041() {
    super(0, (n, s) -> s[0].lcm(s[1]), "", new A000312(), new A056040());
  }
}

package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-04-09/tuptraf at 2024-04-09 23:00

import irvine.math.function.Functions;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A083557 a(n) is the greatest prime factor of 3*a(n-1)+2.
 * @author Georg Fischer
 */
public class A083557 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A083557() {
    super(1, (n, s) -> Functions.GPF.z(s[0].multiply(3).add(2)), "3", PREVIOUS);
  }
}

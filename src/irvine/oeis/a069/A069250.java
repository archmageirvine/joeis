package irvine.oeis.a069;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a004.A004086;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A069250 Sum of the reversals of the proper divisors of n.
 * @author Georg Fischer
 */
public class A069250 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A069250() {
    super(1, (n, s) -> s[0].subtract(s[1]), "", new A069192(), new A004086().skip(1));
  }
}

package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a002.A002378;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A083482 Square root of smallest square of the type n(n+1)*k.
 * @author Georg Fischer
 */
public class A083482 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A083482() {
    super(1, (n, s) -> s[0].multiply(s[1]).sqrt(), "", new A002378().skip(1), new A083481());
  }
}

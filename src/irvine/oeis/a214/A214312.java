package irvine.oeis.a214;
// Generated by gen_seq4.pl 2023-10-27/tuptraf at 2023-10-28 00:14

import irvine.math.z.Binomial;
import irvine.oeis.a056.A056344;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A214312 a(n) is the number of all four-color bracelets (necklaces with turning over allowed) with n beads and the four colors are from a repertoire of n distinct colors, for n &gt;= 4.
 * @author Georg Fischer
 */
public class A214312 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A214312() {
    super(4, (n, s) -> Binomial.binomial(n, 4).multiply(s[0]), "", new A056344().skip(3));
  }
}

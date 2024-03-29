package irvine.oeis.a263;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;
import irvine.oeis.a005.A005101;

/**
 * A263837 Non-abundant numbers (or nonabundant numbers): complement of A005101; numbers k for which sigma(k) &lt;= 2*k.
 * @author Georg Fischer
 */
public class A263837 extends ComplementSequence {

  /** Construct the sequence. */
  public A263837() {
    super(new A005101());
    next();
  }
}

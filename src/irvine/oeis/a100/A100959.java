package irvine.oeis.a100;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;
import irvine.oeis.a001.A001358;

/**
 * A100959 Non-semiprimes.
 * @author Georg Fischer
 */
public class A100959 extends ComplementSequence {

  /** Construct the sequence. */
  public A100959() {
    super(new A001358());
    next();
  }
}

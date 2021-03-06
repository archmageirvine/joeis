package irvine.oeis.a080;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;
import irvine.oeis.a284.A284941;

/**
 * A080580 a(1)=1; for n&gt;1, a(n)=a(n-1)+2 if n is already in the sequence, a(n)=a(n-1)+4 otherwise.
 * @author Georg Fischer
 */
public class A080580 extends ComplementSequence {

  /** Construct the sequence. */
  public A080580() {
    super(new A284941());
    next();
  }
}

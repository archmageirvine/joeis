package irvine.oeis.a094;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;
import irvine.oeis.a001.A001912;

/**
 * A094550 Numbers n such that there are integers a &lt; b with a+(a+1)+...+(n-1) = (n+1)+(n+2)+...+b.
 * @author Georg Fischer
 */
public class A094550 extends ComplementSequence {

  /** Construct the sequence. */
  public A094550() {
    super(new A001912());
    next();
  }
}

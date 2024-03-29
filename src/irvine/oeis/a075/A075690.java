package irvine.oeis.a075;
// Generated by gen_seq4.pl robots/lingf at 2024-01-19 09:53

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A075690 a(n) = (n-1)*(n-2)^4 - A028294(n), for n &gt; 4, with a(1) = a(2) = 0, a(3) = 2, and a(4) = 48.
 * @author Georg Fischer
 */
public class A075690 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A075690() {
    super(1, "[0,0,0,2,38,84,-61,-32,14,-1]", "[1,-5,10,-10,5,-1]");
  }
}

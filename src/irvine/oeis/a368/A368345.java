package irvine.oeis.a368;
// Generated by gen_seq4.pl robots/lingf at 2023-12-23 19:12

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A368345 a(n) = Sum_{k=0..n} 4^(n-k) * floor(k/3).
 * @author Georg Fischer
 */
public class A368345 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A368345() {
    super(0, "[0,0,0,1]", "[1,-5,4,-1,5,-4]");
  }
}

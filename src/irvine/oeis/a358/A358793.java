package irvine.oeis.a358;
// Generated by gen_seq4.pl ogf/lingf at 2023-05-01 21:59

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A358793 Lexicographically earliest sequence of positive and unique integers such that 2*Sum_{k = 1..n} a(k) = Sum_{k = 1..n} a(a(k)) for n &gt; 1 and a(1) = 1.
 * @author Georg Fischer
 */
public class A358793 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A358793() {
    super(1, "[0,1,3,7,4,7,1,8,3,-4,2,-1,1,-3,0,1]", "[1,0,0,-1,0,0,-1,0,0,1]");
  }
}

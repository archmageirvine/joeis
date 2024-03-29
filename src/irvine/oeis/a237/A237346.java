package irvine.oeis.a237;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A237346 For k in {2,3,...,9} define a sequence as follows: a(0)=0; for n&gt;=0, a(n+1)=a(n)+1, unless a(n) ends in k, in which case a(n+1) is obtained by replacing the last digit of a(n) with the digit(s) of k^2. This is k(9).
 * @author Georg Fischer
 */
public class A237346 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A237346() {
    super(0, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 70, 60, 50, 40, 30, 20, 10, 
      0, -10},
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, -11, 0, 0, 0, 0, 0, 0, 0, 0, 
      10});
  }
}

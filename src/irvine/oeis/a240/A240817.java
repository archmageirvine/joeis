package irvine.oeis.a240;

import irvine.oeis.FiniteSequence;

/**
 * A240817 a(1) = 1 for n &lt;= 5; thereafter a(n) = a(n-a(n-2))+a(n-a(n-5)) for n&gt;3.
 * @author Georg Fischer
 */
public class A240817 extends FiniteSequence {

  /** Construct the sequence. */
  public A240817() {
    super(1, 1, 1, 1, 1, 2, 4, 6, 7, 8, 8, 7, 5, 8, 12, 12, 9, 7, 16, 11, 8, 13, 24, 14, 9, 14, 15, 9, 20, 16, 17, 21, 26, 13, 23, 40, 20);
  }
}

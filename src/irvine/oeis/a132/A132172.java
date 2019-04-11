package irvine.oeis.a132;

import irvine.oeis.FiniteSequence;

/**
 * A132172 <code>a(1) = </code>... <code>= a(5) = 1</code>; for <code>n &gt;= 6, a(n)=a(n-a(n-1))+a(n-a(n-5))</code>.
 * @author Georg Fischer
 */
public class A132172 extends FiniteSequence {

  /** Construct the sequence. */
  public A132172() {
    super(1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 8, 10, 9, 11, 10, 13, 10, 14, 12, 15, 13, 17, 13, 18, 14, 19, 15, 19, 16, 24, 16, 23, 19, 24, 16, 30, 17, 25, 21, 30, 16, 33, 22, 30, 20, 43, 15, 38, 20, 48, 10, 50, 13, 40, 16, 73);
  }
}

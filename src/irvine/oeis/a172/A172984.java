package irvine.oeis.a172;

import irvine.oeis.FiniteSequence;

/**
 * A172984 For <code>n &lt;= 18, a(n) =</code> Fibonacci(n) <code>mod 5,</code> using representatives <code>{5,1,2,3,4}</code> (i.e., 5 instead of the usual <code>0),</code> and <code>a(19)=2</code>.
 * @author Georg Fischer
 */
public class A172984 extends FiniteSequence {

  /** Construct the sequence. */
  public A172984() {
    super(1, 1, 2, 3, 5, 3, 3, 1, 4, 5, 4, 4, 3, 2, 5, 2, 2, 4, 2);
  }
}

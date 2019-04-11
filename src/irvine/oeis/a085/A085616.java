package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085616 Numbers <code>n == 3 (mod 8)</code> such that there is only one solution to i^2+j^2+k^2=n, i <code>&gt;= j &gt;= k &gt;= 0</code>.
 * @author Georg Fischer
 */
public class A085616 extends FiniteSequence {

  /** Construct the sequence. */
  public A085616() {
    super(3, 11, 19, 35, 43, 67, 91, 115, 163, 235, 403, 427);
  }
}

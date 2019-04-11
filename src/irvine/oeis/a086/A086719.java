package irvine.oeis.a086;

import irvine.oeis.FiniteSequence;

/**
 * A086719 Numbers <code>n == 1, 2, 5</code> or <code>6 (mod 8)</code> such that there is only one solution to i^2+j^2+k^2=n, i <code>&gt;= j &gt;= k &gt;= 0</code>.
 * @author Georg Fischer
 */
public class A086719 extends FiniteSequence {

  /** Construct the sequence. */
  public A086719() {
    super(1, 2, 5, 6, 10, 13, 14, 21, 22, 30, 37, 42, 46, 58, 70, 78, 93, 133, 142, 190, 253);
  }
}

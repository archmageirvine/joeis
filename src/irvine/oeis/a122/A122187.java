package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122187 First row sum of the matrix <code>M^n</code>, where M is the <code>3 X 3</code> matrix <code>[[6, 5, 3], [5, 4, 2], [3, 2, 1]] (n&gt;=0)</code>.
 * @author Sean A. Irvine
 */
public class A122187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122187() {
    super(new long[] {-1, 4, 11}, new long[] {1, 14, 157});
  }
}

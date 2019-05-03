package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253298 Digital root for the following sequences, <code>F(4*n)/F(4); F(12*n)/F(12); F(20*n)/F(20)</code>, where the pattern increases by 8, ad infinitum, with the Fibonacci numbers F <code>= A000045</code>.
 * @author Sean A. Irvine
 */
public class A253298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253298() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {1, 7, 3, 5, 5, 3, 7, 1, 9, 8, 2, 6, 4, 4, 6, 2, 8});
  }
}

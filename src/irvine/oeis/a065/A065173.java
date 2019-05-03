package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065173 Site swap sequence that rises infinitely after <code>t=0</code>. The associated delta sequence <code>p(t)-t</code> for the permutation of Z: <code>A065171</code>.
 * @author Sean A. Irvine
 */
public class A065173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065173() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 2, 1, 3, 6, 4});
  }
}

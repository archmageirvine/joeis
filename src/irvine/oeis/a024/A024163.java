package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024163 Number of integer-sided triangles with sides a,b,c, a&lt;b&lt;c, <code>a+b+c=n</code> such that c <code>- b &lt; b -</code> a.
 * @author Sean A. Irvine
 */
public class A024163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024163() {
    super(new long[] {1, 0, -1, -1, 0, 1, -1, 0, 1, 1, 0}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}

package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192928 The <code>Gi1</code> and <code>Gi2</code> sums of Losanitsch&#8217;s triangle <code>A034851</code>.
 * @author Sean A. Irvine
 */
public class A192928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192928() {
    super(new long[] {-1, 0, 0, -1, 1, 0, -1, 0, 1, -1, 1, 1}, new long[] {1, 1, 1, 1, 2, 2, 3, 3, 5, 6, 9, 11});
  }
}

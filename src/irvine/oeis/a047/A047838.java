package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047838 <code>a(n) = floor(n^2/2) - 1</code>.
 * @author Sean A. Irvine
 */
public class A047838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047838() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 3, 7, 11});
  }
}

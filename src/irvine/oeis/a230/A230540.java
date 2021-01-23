package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230540 a(n) = 2*n*3^(2*n-1).
 * @author Sean A. Irvine
 */
public class A230540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230540() {
    super(new long[] {-81, 18}, new long[] {0, 6});
  }
}

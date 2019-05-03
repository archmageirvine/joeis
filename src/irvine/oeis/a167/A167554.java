package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167554 The second left hand column of triangle <code>A167552</code>.
 * @author Sean A. Irvine
 */
public class A167554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167554() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-2, -5, -7, -6});
  }
}

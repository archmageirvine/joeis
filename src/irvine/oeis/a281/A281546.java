package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281546 <code>a(n) = 27*n + 2</code>.
 * @author Sean A. Irvine
 */
public class A281546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281546() {
    super(new long[] {-1, 2}, new long[] {2, 29});
  }
}

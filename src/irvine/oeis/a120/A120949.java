package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120949 <code>2n+3^n+5^n</code>.
 * @author Sean A. Irvine
 */
public class A120949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120949() {
    super(new long[] {-15, 38, -32, 10}, new long[] {2, 10, 38, 158});
  }
}

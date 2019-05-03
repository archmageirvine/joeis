package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153466 <code>a(n) = A027941(n) + A027941(n+6)</code>.
 * @author Sean A. Irvine
 */
public class A153466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153466() {
    super(new long[] {1, -4, 4}, new long[] {232, 610, 1600});
  }
}

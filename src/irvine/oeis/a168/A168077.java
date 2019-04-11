package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168077 <code>a(2n) =</code> A129194(2n)/2; <code>a(2n+1) =</code> A129194(2n+1).
 * @author Sean A. Irvine
 */
public class A168077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168077() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 1, 1, 9, 4, 25});
  }
}

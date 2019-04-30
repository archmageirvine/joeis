package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180578 The Wiener index of the Dutch windmill graph <code>D(6,n) (n&gt;=1)</code>.
 * @author Sean A. Irvine
 */
public class A180578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180578() {
    super(new long[] {1, -3, 3}, new long[] {27, 144, 351});
  }
}

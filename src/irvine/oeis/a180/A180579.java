package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180579 The Wiener index of the Dutch windmill graph <code>D(5,n) (n&gt;=1)</code>.
 * @author Sean A. Irvine
 */
public class A180579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180579() {
    super(new long[] {1, -3, 3}, new long[] {15, 78, 189});
  }
}

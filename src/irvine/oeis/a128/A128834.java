package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128834 Periodic sequence <code>0,1,1,0,-1,-1,..</code>.
 * @author Sean A. Irvine
 */
public class A128834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128834() {
    super(new long[] {-1, 1}, new long[] {0, 1});
  }
}

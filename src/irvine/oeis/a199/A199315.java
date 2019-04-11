package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199315 <code>(11*5^n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A199315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199315() {
    super(new long[] {-5, 6}, new long[] {6, 28});
  }
}

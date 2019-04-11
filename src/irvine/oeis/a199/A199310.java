package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199310 <code>7*5^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199310() {
    super(new long[] {-5, 6}, new long[] {8, 36});
  }
}

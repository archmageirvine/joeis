package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199488 <code>10*7^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199488() {
    super(new long[] {-7, 8}, new long[] {11, 71});
  }
}

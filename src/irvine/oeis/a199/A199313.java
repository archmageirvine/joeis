package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199313 <code>9*5^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199313() {
    super(new long[] {-5, 6}, new long[] {10, 46});
  }
}

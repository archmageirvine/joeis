package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199758 <code>7*11^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199758() {
    super(new long[] {-11, 12}, new long[] {8, 78});
  }
}

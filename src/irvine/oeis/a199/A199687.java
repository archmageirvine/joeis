package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199687 <code>7*10^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199687() {
    super(new long[] {-10, 11}, new long[] {8, 71});
  }
}

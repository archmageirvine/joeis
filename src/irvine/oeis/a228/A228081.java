package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228081 <code>64^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A228081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228081() {
    super(new long[] {-64, 65}, new long[] {2, 65});
  }
}

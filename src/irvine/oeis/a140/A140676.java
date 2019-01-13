package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140676.
 * @author Sean A. Irvine
 */
public class A140676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140676() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 20});
  }
}

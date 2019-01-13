package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140064.
 * @author Sean A. Irvine
 */
public class A140064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140064() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 14});
  }
}

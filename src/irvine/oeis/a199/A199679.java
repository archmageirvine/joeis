package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199679 <code>(11*9^n+1)/4</code>.
 * @author Sean A. Irvine
 */
public class A199679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199679() {
    super(new long[] {-9, 10}, new long[] {3, 25});
  }
}

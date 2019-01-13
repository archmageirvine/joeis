package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164044.
 * @author Sean A. Irvine
 */
public class A164044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164044() {
    super(new long[] {4, -9, 6}, new long[] {1, 3, 10});
  }
}

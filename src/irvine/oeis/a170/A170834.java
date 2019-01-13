package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170834.
 * @author Sean A. Irvine
 */
public class A170834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170834() {
    super(new long[] {-25, 0, 5, 5, 0}, new long[] {5, 5, 25, 25, 145});
  }
}

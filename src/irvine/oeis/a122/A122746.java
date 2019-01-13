package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122746.
 * @author Sean A. Irvine
 */
public class A122746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122746() {
    super(new long[] {-4, 2, 2}, new long[] {1, 2, 6});
  }
}

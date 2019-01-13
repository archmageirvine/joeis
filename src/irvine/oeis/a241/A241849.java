package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241849.
 * @author Sean A. Irvine
 */
public class A241849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241849() {
    super(new long[] {1, -3, 3}, new long[] {19, 20, 23});
  }
}

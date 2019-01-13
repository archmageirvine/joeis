package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122370.
 * @author Sean A. Irvine
 */
public class A122370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122370() {
    super(new long[] {53, -189, 192, -81, 15}, new long[] {1, 5, 29, 172, 1026});
  }
}

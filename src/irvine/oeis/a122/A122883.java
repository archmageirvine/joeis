package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122883.
 * @author Sean A. Irvine
 */
public class A122883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122883() {
    super(new long[] {-2, 11, 4}, new long[] {1, 3, 23});
  }
}

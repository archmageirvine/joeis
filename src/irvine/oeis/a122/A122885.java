package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122885.
 * @author Sean A. Irvine
 */
public class A122885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122885() {
    super(new long[] {-2, 11, 4}, new long[] {1, 13, 61});
  }
}

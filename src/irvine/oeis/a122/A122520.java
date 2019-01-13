package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122520.
 * @author Sean A. Irvine
 */
public class A122520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122520() {
    super(new long[] {1, 0, -1, -1, -1}, new long[] {1, 1, 1, 1, 1});
  }
}

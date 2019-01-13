package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283971.
 * @author Sean A. Irvine
 */
public class A283971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283971() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 1, 3, 4, 5, 3, 7});
  }
}

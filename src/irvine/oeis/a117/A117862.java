package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117862.
 * @author Sean A. Irvine
 */
public class A117862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117862() {
    super(new long[] {-3, 3, 1}, new long[] {2, 4, 10});
  }
}

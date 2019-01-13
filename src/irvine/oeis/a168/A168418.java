package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168418.
 * @author Sean A. Irvine
 */
public class A168418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168418() {
    super(new long[] {-1, 1, 1}, new long[] {5, 5, 14});
  }
}

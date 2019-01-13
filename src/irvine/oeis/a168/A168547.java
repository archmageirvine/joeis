package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168547.
 * @author Sean A. Irvine
 */
public class A168547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168547() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 17, 59});
  }
}

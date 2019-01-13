package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047245.
 * @author Sean A. Irvine
 */
public class A047245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047245() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 7});
  }
}

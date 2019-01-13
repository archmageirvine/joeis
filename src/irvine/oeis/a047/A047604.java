package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047604.
 * @author Sean A. Irvine
 */
public class A047604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047604() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 3, 5, 10});
  }
}

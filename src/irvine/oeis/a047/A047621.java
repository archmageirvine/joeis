package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047621.
 * @author Sean A. Irvine
 */
public class A047621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047621() {
    super(new long[] {-1, 1, 1}, new long[] {3, 5, 11});
  }
}

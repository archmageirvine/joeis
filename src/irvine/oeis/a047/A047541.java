package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047541.
 * @author Sean A. Irvine
 */
public class A047541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047541() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 2, 4, 7});
  }
}

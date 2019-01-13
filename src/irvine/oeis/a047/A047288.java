package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047288.
 * @author Sean A. Irvine
 */
public class A047288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047288() {
    super(new long[] {-1, 1, 1}, new long[] {4, 6, 11});
  }
}

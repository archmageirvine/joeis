package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026384.
 * @author Sean A. Irvine
 */
public class A026384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026384() {
    super(new long[] {-5, 5, 1}, new long[] {1, 3, 8});
  }
}

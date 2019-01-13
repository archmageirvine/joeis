package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127932.
 * @author Sean A. Irvine
 */
public class A127932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127932() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 4, 4, 4, 5});
  }
}

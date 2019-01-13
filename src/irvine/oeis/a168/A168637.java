package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168637.
 * @author Sean A. Irvine
 */
public class A168637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168637() {
    super(new long[] {-1, 0, 1, 1}, new long[] {0, 1, 3, 3});
  }
}

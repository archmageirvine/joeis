package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199405.
 * @author Sean A. Irvine
 */
public class A199405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199405() {
    super(new long[] {-1, 0, 11, 0}, new long[] {1, 14, 25, 155});
  }
}

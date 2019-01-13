package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168606.
 * @author Sean A. Irvine
 */
public class A168606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168606() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 4, 20, 102});
  }
}

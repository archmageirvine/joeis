package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056000.
 * @author Sean A. Irvine
 */
public class A056000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056000() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 11});
  }
}

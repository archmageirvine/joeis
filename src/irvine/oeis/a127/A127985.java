package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127985.
 * @author Sean A. Irvine
 */
public class A127985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127985() {
    super(new long[] {4, -4, -3, 4}, new long[] {0, 1, 4, 11});
  }
}

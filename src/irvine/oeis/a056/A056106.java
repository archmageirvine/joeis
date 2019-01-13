package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056106.
 * @author Sean A. Irvine
 */
public class A056106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056106() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 11});
  }
}

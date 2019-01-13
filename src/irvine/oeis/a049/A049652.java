package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049652.
 * @author Sean A. Irvine
 */
public class A049652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049652() {
    super(new long[] {-1, -3, 5}, new long[] {0, 1, 5});
  }
}

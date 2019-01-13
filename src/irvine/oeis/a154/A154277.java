package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154277.
 * @author Sean A. Irvine
 */
public class A154277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154277() {
    super(new long[] {1, -3, 3}, new long[] {17, 26, 197});
  }
}

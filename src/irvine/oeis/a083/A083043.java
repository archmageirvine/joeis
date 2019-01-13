package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083043.
 * @author Sean A. Irvine
 */
public class A083043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083043() {
    super(new long[] {-1, 20}, new long[] {1, 21});
  }
}

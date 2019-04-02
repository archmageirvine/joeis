package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116156 (n^2+n)*5^n.
 * @author Sean A. Irvine
 */
public class A116156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116156() {
    super(new long[] {125, -75, 15}, new long[] {0, 10, 150});
  }
}

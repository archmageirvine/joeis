package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158501 Hankel transform of <code>A158500</code>.
 * @author Sean A. Irvine
 */
public class A158501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158501() {
    super(new long[] {1, 1, -3, -3, 3, 3, -1}, new long[] {1, 0, 25, -24, 105, -104, 273});
  }
}

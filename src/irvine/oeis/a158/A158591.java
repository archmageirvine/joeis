package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158591 <code>36n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158591() {
    super(new long[] {1, -3, 3}, new long[] {1, 37, 145});
  }
}

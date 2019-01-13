package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021144.
 * @author Sean A. Irvine
 */
public class A021144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021144() {
    super(new long[] {-100, 180, -97, 18}, new long[] {1, 18, 227, 2520});
  }
}

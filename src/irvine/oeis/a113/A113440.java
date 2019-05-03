package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113440 First row of <code>A113439</code>.
 * @author Sean A. Irvine
 */
public class A113440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113440() {
    super(new long[] {1, -20, 38, -28, 9}, new long[] {1, 2, 8, 34, 146});
  }
}

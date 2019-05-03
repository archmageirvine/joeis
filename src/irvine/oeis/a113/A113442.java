package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113442 Third row of <code>A113439</code>.
 * @author Sean A. Irvine
 */
public class A113442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113442() {
    super(new long[] {1, -20, 38, -28, 9}, new long[] {1, 4, 17, 72, 306});
  }
}

package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116144 <code>(n^2+n)*4^n</code>.
 * @author Sean A. Irvine
 */
public class A116144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116144() {
    super(new long[] {64, -48, 12}, new long[] {0, 8, 96});
  }
}

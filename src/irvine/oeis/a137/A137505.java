package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137505 Inverse binomial transform of <code>A007910</code>.
 * @author Sean A. Irvine
 */
public class A137505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137505() {
    super(new long[] {2, 0, -1}, new long[] {1, 1, 0});
  }
}

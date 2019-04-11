package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214660 <code>9*n^2 - 11*n + 3</code>.
 * @author Sean A. Irvine
 */
public class A214660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214660() {
    super(new long[] {1, -3, 3}, new long[] {1, 17, 51});
  }
}

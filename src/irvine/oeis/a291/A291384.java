package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291384 <code>a(n) =</code> (1/2)*A291383(n).
 * @author Sean A. Irvine
 */
public class A291384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291384() {
    super(new long[] {2, 4, 4, 2}, new long[] {1, 4, 14, 49});
  }
}

package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291039 <code>a(n) =</code> (1/4)*A291038(n).
 * @author Sean A. Irvine
 */
public class A291039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291039() {
    super(new long[] {-1, 0, -4, 2, -4, 4}, new long[] {1, 3, 8, 21, 54, 136});
  }
}

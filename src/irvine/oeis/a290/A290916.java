package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290916 <code>a(n) =</code> (1/8)*A290915(n).
 * @author Sean A. Irvine
 */
public class A290916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290916() {
    super(new long[] {-1, 4, 2, 4}, new long[] {0, 1, 4, 18});
  }
}

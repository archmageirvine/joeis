package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051873 21-gonal numbers: <code>a(n) = n*(19n - 17)/2</code>.
 * @author Sean A. Irvine
 */
public class A051873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051873() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 21});
  }
}

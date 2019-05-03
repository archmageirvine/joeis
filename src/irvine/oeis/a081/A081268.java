package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081268 Diagonal of triangular spiral in <code>A051682</code>.
 * @author Sean A. Irvine
 */
public class A081268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081268() {
    super(new long[] {1, -3, 3}, new long[] {1, 12, 32});
  }
}

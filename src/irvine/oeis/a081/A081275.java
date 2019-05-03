package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081275 Shallow diagonal of triangular spiral in <code>A051682</code>.
 * @author Sean A. Irvine
 */
public class A081275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081275() {
    super(new long[] {1, -3, 3}, new long[] {1, 31, 97});
  }
}

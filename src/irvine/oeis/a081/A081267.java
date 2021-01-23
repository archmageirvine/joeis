package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081267 Diagonal of triangular spiral in A051682.
 * @author Sean A. Irvine
 */
public class A081267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081267() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 26});
  }
}

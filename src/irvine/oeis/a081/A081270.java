package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081270 Diagonal of triangular spiral in A051682.
 * @author Sean A. Irvine
 */
public class A081270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081270() {
    super(new long[] {1, -3, 3}, new long[] {3, 16, 38});
  }
}

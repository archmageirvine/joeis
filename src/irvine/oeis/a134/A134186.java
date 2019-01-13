package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134186.
 * @author Sean A. Irvine
 */
public class A134186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134186() {
    super(new long[] {-1, 0, 2, 2, -1}, new long[] {4, 3, 5, 4, 7});
  }
}

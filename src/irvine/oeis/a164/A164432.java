package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164432.
 * @author Sean A. Irvine
 */
public class A164432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164432() {
    super(new long[] {1, 0, 1, 1, 0, 1}, new long[] {13, 21, 34, 57, 95, 158});
  }
}

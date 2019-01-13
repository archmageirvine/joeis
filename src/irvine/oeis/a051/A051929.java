package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051929.
 * @author Sean A. Irvine
 */
public class A051929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051929() {
    super(new long[] {1, 5, 3}, new long[] {5, 1, 21});
  }
}

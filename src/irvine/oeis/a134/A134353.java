package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134353.
 * @author Sean A. Irvine
 */
public class A134353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134353() {
    super(new long[] {-8, 4, 2}, new long[] {1, 2, 8});
  }
}

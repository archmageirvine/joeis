package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047290.
 * @author Sean A. Irvine
 */
public class A047290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047290() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 6, 8});
  }
}

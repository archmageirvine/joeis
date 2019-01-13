package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003229.
 * @author Sean A. Irvine
 */
public class A003229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003229() {
    super(new long[] {2, 0, 1}, new long[] {1, 1, 3});
  }
}

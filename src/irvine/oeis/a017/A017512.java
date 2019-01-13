package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017512.
 * @author Sean A. Irvine
 */
public class A017512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017512() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {10000, 194481, 1048576, 3418801, 8503056});
  }
}

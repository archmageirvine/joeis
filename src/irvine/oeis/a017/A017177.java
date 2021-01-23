package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017177 (9n+1)^5.
 * @author Sean A. Irvine
 */
public class A017177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017177() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 100000, 2476099, 17210368, 69343957, 205962976});
  }
}

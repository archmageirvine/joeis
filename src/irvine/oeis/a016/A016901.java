package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016901.
 * @author Sean A. Irvine
 */
public class A016901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016901() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1024, 59049, 537824, 2476099, 7962624, 20511149});
  }
}

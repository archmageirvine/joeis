package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123111.
 * @author Sean A. Irvine
 */
public class A123111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123111() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {5, 173, 2467, 17489, 81401, 287965, 840743, 2130497});
  }
}

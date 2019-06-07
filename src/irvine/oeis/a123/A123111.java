package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123111 <code>1+n^2+n^3+n^5+n^7; 10101101</code> in base <code>n</code>.
 * @author Sean A. Irvine
 */
public class A123111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123111() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {5, 173, 2467, 17489, 81401, 287965, 840743, 2130497});
  }
}

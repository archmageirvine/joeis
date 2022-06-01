package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003695 Number of Hamiltonian paths in P_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003695() {
    super(new long[] {0, 0, 1, -4, 3, 13, -31, -2, 57, -38, -69, 48, 37, -27, -5, 6},
      new long[] {1, 14, 62, 276, 1006, 3610, 12010, 38984, 122188, 375122, 1128446, 3342794, 9767588, 28217820, 80709424, 228864620});
  }
}

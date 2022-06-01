package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003736 Number of 2-factors in W_5 X P_n.
 * @author Sean A. Irvine
 */
public class A003736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003736() {
    super(new long[] {-24, 1098, -1354, -285, 149, 21},
      new long[] {4, 156, 3832, 101476, 2653176, 69537644}
    );
  }
}


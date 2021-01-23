package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003735 Number of perfect matchings (or domino tilings) in W_5 X P_2n.
 * @author Sean A. Irvine
 */
public class A003735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003735() {
    super(new long[] {-1, 44, -102, 44},
      new long[] {29, 1189, 49401, 2053641}
    );
  }
}

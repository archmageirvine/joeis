package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145405 Number of 2-factors in O_6 X P_n.
 * @author Sean A. Irvine
 */
public class A145405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145405() {
    super(1, new long[] {-8496, 3148, 17644, -10329, 585, 113}, new long[] {20, 2984, 340852, 40071100, 4696965476L, 550730736140L});
  }
}

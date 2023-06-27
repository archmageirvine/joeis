package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216112 The Wiener index of the para-polyphenyl chain with n hexagons (see the Dou et al. and the Deng references).
 * @author Sean A. Irvine
 */
public class A216112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216112() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {27, 198, 657, 1548});
  }
}

package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216109 The hyper-Wiener index of the ortho-polyphenyl chain with n hexagons (see the Dou et al. and the Deng references).
 * @author Sean A. Irvine
 */
public class A216109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216109() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {42, 477, 1701, 4254, 8820});
  }
}

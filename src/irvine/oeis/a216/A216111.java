package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216111 The hyper-Wiener index of the meta-polyphenyl chain with n hexagons (see the Dou et al. and the Deng <code>references)</code>.
 * @author Sean A. Irvine
 */
public class A216111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216111() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {42, 477, 1953, 5442, 12240});
  }
}

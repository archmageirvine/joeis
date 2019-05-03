package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216108 The Wiener index of the ortho-polyphenyl chain with n hexagons (see the Dou et al. and the Deng references).
 * @author Sean A. Irvine
 */
public class A216108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216108() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 198, 585, 1260});
  }
}

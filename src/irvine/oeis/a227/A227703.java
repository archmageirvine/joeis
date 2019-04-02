package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227703 The Wiener index of the zig-zag polyhex nanotube TUHC_6[2n,2] defined pictorially in Fig. 1 of the Eliasi et al. reference.
 * @author Sean A. Irvine
 */
public class A227703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227703() {
    super(new long[] {-1, 4, -6, 4}, new long[] {52, 150, 328, 610});
  }
}

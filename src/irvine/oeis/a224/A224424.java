package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224424 The hyper-Wiener index of the Micelle-like chiral dendrimer <code>G[n]</code> defined pictorially in the Hassan Yousefi-Azari et al. reference.
 * @author Sean A. Irvine
 */
public class A224424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224424() {
    super(new long[] {512, -1664, 2208, -1560, 636, -150, 19}, new long[] {147859, 984643, 6530659, 40951843, 241838755, 1355802019, 7283759011L});
  }
}

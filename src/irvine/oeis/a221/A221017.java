package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221017 The hyper-Wiener index of the fullerenyl anion <code>G[n]C[60]</code>, defined pictorially in the Arezoomand reference (see Fig. <code>5)</code>.
 * @author Sean A. Irvine
 */
public class A221017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221017() {
    super(new long[] {512, -1664, 2208, -1560, 636, -150, 19}, new long[] {47750, 136534, 559318, 2753270, 15400950, 90898294, 533474678});
  }
}

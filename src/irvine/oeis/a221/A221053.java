package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221053 The hyper-Wiener index of the nanostar dendrimer NSC_5C_6[n], defined pictorially in the A. R. Ashrafi et al. reference and in the M. Rostami et al. reference.
 * @author Sean A. Irvine
 */
public class A221053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221053() {
    super(new long[] {512, -1664, 2208, -1560, 636, -150, 19}, new long[] {8580, 751148, 13742092, 145113196, 1166551916, 7991214060L, 49348860396L});
  }
}

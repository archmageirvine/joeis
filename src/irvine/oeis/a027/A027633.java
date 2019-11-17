package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027633 Molien series for full <code>8x8</code> Siegel modular group <code>H_3</code> of order 371589120.
 * @author Sean A. Irvine
 */
public class A027633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027633() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 2, -1, -1, 1, -2, 0, 0, -2, 2, 0, -1, 3, -1, 1, 2, -3, 2, 0, -3, 3, -3, 0, 3, -4, 3, 0, -3, 3, -3, 0, 2, -3, 2, 1, -1, 3, -1, 0, 2, -2, 0, 0, -2, 1, -1, -1, 2, -1, 1, 0, 0, 1},
      new long[] {1, 0, 1, 1, 2, 2, 5, 4, 9, 10, 16, 19, 31, 34, 53, 64, 89, 109, 152, 179, 245, 296, 384, 467, 601, 716, 911, 1090, 1351, 1614, 1986, 2342, 2856, 3364, 4037, 4742, 5653, 6578, 7791, 9036, 10592, 12243, 14268, 16380, 18990, 21724, 24999, 28501, 32643, 37017, 42218, 47713, 54112, 60968, 68869, 77264, 86971, 97271});
  }
}

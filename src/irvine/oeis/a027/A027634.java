package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027634 Poincar\u00e9 (or Molien) series for ring of Siegel modular forms of genus <code>3</code> (associated with full modular group <code>Gamma_3)</code>.
 * @author Sean A. Irvine
 */
public class A027634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027634() {
    super(new long[] {1, -1, 0, 0, 0, 0, -2, 1, 1, -1, 0, 1, 1, 1, -2, 1, 2, -2, -1, 0, 0, 1, -3, 0, 3, -2, 0, 0, 0, 2, -3, 0, 3, -1, 0, 0, 1, 2, -2, -1, 2, -1, -1, -1, 0, 1, -1, -1, 2, 0, 0, 0, 0, 1},
      new long[] {1, 1, 2, 4, 3, 7, 8, 11, 15, 22, 24, 37, 45, 58, 75, 99, 115, 156, 187, 232, 288, 356, 420, 527, 623, 750, 898, 1075, 1252, 1505, 1750, 2051, 2400, 2797, 3214, 3754, 4294, 4939, 5665, 6477, 7344, 8398, 9481, 10731, 12121, 13653, 15293, 17219, 19212, 21469, 23951, 26651, 29551, 32859}, 1, 0, 1);
  }
}

package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003760 Number of Hamiltonian paths in D_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003760() {
    super(new long[]{0, 0, 1, -13, 71, -225, 417, -353, -259, 1013, -887, -247, 986, -454, -270, 266, -22, -34, 11},
      new long[]{2, 40, 240, 1558, 8300, 43438, 212700, 1014700, 4691580, 21257258, 94520524, 414149254,
        1791339472, 7664373014L, 32481662616L, 136520499746L, 569599125312L, 2361080470268L, 9730117780704L}
    );
  }
}

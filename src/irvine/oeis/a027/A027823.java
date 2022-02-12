package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027823 a(n) = 77*(n+1)*binomial(n+6,11).
 * @author Sean A. Irvine
 */
public class A027823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027823() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {462, 6468, 48048, 252252, 1051050, 3699696, 11435424, 31855824, 81477396, 193993800, 434546112, 923410488, 1873980108});
  }
}

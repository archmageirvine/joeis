package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211387 Expansion of <code>x*(1 -15*x +99*x^2 -373*x^3 +879*x^4 -1338*x^5 +1311*x^6 -804*x^7 +289*x^8 -44*x^9) / [(1-3*x+x^2) *(1-2*x)^6 *(1-x)^2]</code>.
 * @author Sean A. Irvine
 */
public class A211387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211387() {
    super(new long[] {-64, 512, -1712, 3216, -3804, 2984, -1581, 561, -128, 17}, new long[] {1, 2, 5, 17, 69, 286, 1137, 4277, 15247, 51786});
  }
}

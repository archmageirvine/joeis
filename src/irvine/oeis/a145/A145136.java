package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145136 Expansion of <code>x/((1 - x - x^4)*(1 - x)^7)</code>.
 * @author Sean A. Irvine
 */
public class A145136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145136() {
    super(new long[] {-1, 7, -21, 34, -27, -7, 49, -69, 56, -28, 8}, new long[] {0, 1, 8, 36, 120, 331, 801, 1761, 3597, 6931, 12737});
  }
}

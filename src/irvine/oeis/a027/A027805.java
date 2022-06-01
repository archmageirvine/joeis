package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027805 a(n) = 21*(n+1)*binomial(n+4,9).
 * @author Sean A. Irvine
 */
public class A027805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027805() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {126, 1470, 9240, 41580, 150150, 462462, 1261260, 3123120, 7147140, 15315300, 31039008});
  }
}

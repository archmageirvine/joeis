package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245829 Szeged index of the prism graph C_n X P_2 (n &gt;=3).
 * @author Sean A. Irvine
 */
public class A245829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245829() {
    super(3, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {51, 192, 285, 648, 847, 1536, 1881});
  }
}

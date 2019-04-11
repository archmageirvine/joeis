package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245829 Szeged index of the prism graph C_n X P_2 <code>(n &gt;=3)</code>.
 * @author Sean A. Irvine
 */
public class A245829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245829() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {51, 192, 285, 648, 847, 1536, 1881});
  }
}

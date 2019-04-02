package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054326 Eighth unsigned column of Lanczos triangle A053125 (decreasing powers).
 * @author Sean A. Irvine
 */
public class A054326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054326() {
    super(new long[] {-65536, 131072, -114688, 57344, -17920, 3584, -448, 32}, new long[] {8, 480, 12672, 219648, 2928640, 32587776, 317521920, 2794192896L});
  }
}

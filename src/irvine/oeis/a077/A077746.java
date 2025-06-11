package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;

/**
 * A077744.
 * @author Sean A. Irvine
 */
public class A077746 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A077746() {
    // Next term is too large to represent
    super(1, NONCOMPUTABLE, Z.ONE, Z.TWO, Z.SEVEN, Z.valueOf(168), new Z("380002722841984290048000"));
  }
}

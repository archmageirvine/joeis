package irvine.oeis.a127;

import irvine.oeis.a126.A126555;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A127558 Decimal expansion of the number 29.000694926917980144237135814... having continued fraction expansion 29, 1439, 4211, 7703, 12907, 14957, ... (A126555).
 * @author Sean A. Irvine
 */
public class A127558 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A127558() {
    super(2, new A126555());
  }
}

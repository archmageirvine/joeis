package irvine.oeis.a127;

import irvine.oeis.a126.A126556;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A127559 Decimal expansion of the number 734.000353982279850297391846... having continued fraction expansion 734, 2825, 5957, 10305, 13932, ... (interprimes of third order A126556).
 * @author Sean A. Irvine
 */
public class A127559 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A127559() {
    super(3, new A126556());
  }
}

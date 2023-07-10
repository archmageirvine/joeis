package irvine.oeis.a293;

import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007908;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A293577 Decimal expansion of number with continued fraction expansion 0, 1, 12, 123, 1234, 12345, 123456, ... (A007908).
 * @author Sean A. Irvine
 */
public class A293577 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A293577() {
    super(0, new PrependSequence(new A007908(), 0));
  }
}

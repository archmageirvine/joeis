package irvine.oeis.a099;
// Generated by gen_seq4.pl decexp at 2021-07-25 17:16

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A099281 Decimal expansion of the sine integral at 1.
 * Formula: si(1)
 * @author Georg Fischer
 */
public class A099281 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A099281() {
    super(0, CrFunctions.SI.cr(CR.ONE));
  }
}

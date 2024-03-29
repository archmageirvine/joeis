package irvine.oeis.a319;
// Generated by gen_seq4.pl dex CR.ONE.divide(CR.valueOf(24)).subtract(CR.ONE.divide(CR.EIGHT.multiply(CR.PI))) false 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A319462 Decimal expansion of 1/24 - 1/(8*Pi).
 * @author Georg Fischer
 */
public class A319462 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A319462() {
    super(-2, CR.ONE.divide(CR.valueOf(24)).subtract(CR.ONE.divide(CR.EIGHT.multiply(CR.PI))));
  }
}

package irvine.oeis.a133;
// Generated by gen_seq4.pl dex CR.E.add(CR.PI).add(CR.PHI).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A133056 Decimal expansion of (e + Pi + phi)/2.
 * @author Georg Fischer
 */
public class A133056 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A133056() {
    super(CR.E.add(CR.PI).add(CR.PHI).divide(CR.TWO));
  }
}

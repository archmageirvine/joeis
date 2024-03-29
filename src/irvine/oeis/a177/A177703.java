package irvine.oeis.a177;
// Generated by gen_seq4.pl dex CR.TWO.add(CR.TEN.sqrt()).divide(CR.THREE) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A177703 Decimal expansion of (2+sqrt(10))/3.
 * @author Georg Fischer
 */
public class A177703 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A177703() {
    super(CR.TWO.add(CR.TEN.sqrt()).divide(CR.THREE));
  }
}

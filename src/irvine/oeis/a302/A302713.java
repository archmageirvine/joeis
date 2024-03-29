package irvine.oeis.a302;
// Generated by gen_seq4.pl dex CR.TWO.multiply(CR.valueOf(15).multiply(CR.PI).divide(CR.valueOf(64)).sin()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A302713 Decimal expansion of 2*sin(15*Pi/64).
 * @author Georg Fischer
 */
public class A302713 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A302713() {
    super(CR.TWO.multiply(CR.valueOf(15).multiply(CR.PI).divide(CR.valueOf(64)).sin()));
  }
}

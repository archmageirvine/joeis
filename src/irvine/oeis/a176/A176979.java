package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.valueOf(15).add(CR.valueOf(365).sqrt()).divide(CR.TEN) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A176979 Decimal expansion of (15+sqrt(365))/10.
 * @author Georg Fischer
 */
public class A176979 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A176979() {
    super(CR.valueOf(15).add(CR.valueOf(365).sqrt()).divide(CR.TEN));
  }
}

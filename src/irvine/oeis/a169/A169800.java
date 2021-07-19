package irvine.oeis.a169;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A169800 Decimal expansion of 2/log(1+sqrt(2)).
 * @author Sean A. Irvine
 */
public class A169800 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A169800() {
    super(CR.TWO.divide(CR.ONE.add(CR.TWO.sqrt()).log()));
  }
}

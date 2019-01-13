package irvine.oeis.a169;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A169800.
 * @author Sean A. Irvine
 */
public class A169800 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.divide(CR.ONE.add(CR.TWO.sqrt()).log());

  @Override
  protected CR getCR() {
    return N;
  }
}

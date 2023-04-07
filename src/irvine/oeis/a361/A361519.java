package irvine.oeis.a361;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A361519 Decimal expansion of arccsch(Pi).
 * @author Sean A. Irvine
 */
public class A361519 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A361519() {
    super(0, ComputableReals.SINGLETON.acsch(CR.PI));
  }
}

package irvine.oeis.a361;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A361518 Decimal expansion of arccoth(Pi).
 * @author Sean A. Irvine
 */
public class A361518 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A361518() {
    super(0, ComputableReals.SINGLETON.acoth(CR.PI));
  }
}

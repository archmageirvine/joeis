package irvine.oeis.a218;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.a060.A060006;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A218197 Decimal expansion of the Perrin argument a (see below).
 * @author Sean A. Irvine
 */
public class A218197 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A218197() {
    super(0, ComputableReals.SINGLETON.acos(CR.ONE.subtract(new A060006().getCR()).divide(2)).divide(2));
  }
}

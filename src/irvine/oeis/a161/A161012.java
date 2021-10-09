package irvine.oeis.a161;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A161012 Decimal expansion of tan(1/3).
 * @author Sean A. Irvine
 */
public class A161012 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A161012() {
    super(ComputableReals.SINGLETON.tan(CR.ONE_THIRD));
  }
}

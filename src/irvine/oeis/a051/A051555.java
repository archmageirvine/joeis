package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A051555 Decimal expansion of tan(Pi degrees). (Of course, tan(Pi radians) = 0.).
 * @author Sean A. Irvine
 */
public class A051555 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051555() {
    super(0, ComputableReals.SINGLETON.tan(CR.PI.multiply(CR.PI).divide(CR.valueOf(180))));
  }
}

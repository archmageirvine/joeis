package irvine.oeis.a345;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A345653 allocated for Thomas Anton.
 * @author Sean A. Irvine
 */
public class A345653 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A345653() {
    super(0, CR.SQRT2.add(ComputableReals.SINGLETON.asinh(CR.ONE)).divide(CR.FOUR));
  }
}

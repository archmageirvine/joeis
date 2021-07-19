package irvine.oeis.a195;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A195793 Decimal expansion of arctan(1000000).
 * @author Sean A. Irvine
 */
public class A195793 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195793() {
    super(ComputableReals.SINGLETON.atan(CR.valueOf(1000000)));
  }
}

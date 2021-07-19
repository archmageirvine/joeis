package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A007507 Decimal expansion of 2^sqrt(2).
 * @author Sean A. Irvine
 */
public class A007507 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A007507() {
    super(ComputableReals.SINGLETON.pow(CR.TWO, CR.TWO.sqrt()));
  }
}

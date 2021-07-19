package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010642 Decimal expansion of cube root of 72.
 * @author Sean A. Irvine
 */
public class A010642 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010642() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(72), CR.ONE_THIRD));
  }
}

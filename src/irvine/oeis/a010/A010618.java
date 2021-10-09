package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010618 Decimal expansion of cube root of 47.
 * @author Sean A. Irvine
 */
public class A010618 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010618() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(47), CR.ONE_THIRD));
  }
}

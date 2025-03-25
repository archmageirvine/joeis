package irvine.oeis.a099;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A099285 Decimal expansion of -Ei(-1), negated exponential integral at -1.
 * @author Sean A. Irvine
 */
public class A099285 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A099285() {
    super(0, CrFunctions.EI.cr(CR.ONE.negate()).negate());
  }
}

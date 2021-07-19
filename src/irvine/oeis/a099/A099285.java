package irvine.oeis.a099;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A099285 Decimal expansion of -Ei(-1), negated exponential integral at -1.
 * @author Sean A. Irvine
 */
public class A099285 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A099285() {
    super(CR.ONE.negate().ei().negate());
  }
}

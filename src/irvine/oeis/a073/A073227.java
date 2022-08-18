package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073227 Decimal expansion of e^e^e.
 * @author Sean A. Irvine
 */
public class A073227 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073227() {
    super(7, CR.E.exp().exp());
  }
}

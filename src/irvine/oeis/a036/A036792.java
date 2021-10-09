package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A036792 Decimal expansion of Integral_{x=0..Pi} sin(x)/x.
 * @author Sean A. Irvine
 */
public class A036792 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A036792() {
    super(CR.PI.si());
  }
}

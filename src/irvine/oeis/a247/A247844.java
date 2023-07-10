package irvine.oeis.a247;

import irvine.math.cr.CR;
import irvine.oeis.a052.A052119;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A247844 Decimal expansion of the value of the continued fraction [1; 1, 2, 3, 4, 5, ...].
 * @author Sean A. Irvine
 */
public class A247844 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A247844() {
    super(1, new A052119().getCR().add(CR.ONE));
  }
}

package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392340 allocated for Michal Paulovic.
 * @author Sean A. Irvine
 */
public class A392340 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392340() {
    super(2, CR.valueOf(15).divide(CR.PI.divide(15).tan().multiply(4)));
  }
}

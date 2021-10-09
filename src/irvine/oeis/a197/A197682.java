package irvine.oeis.a197;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197682 Decimal expansion of Pi/(2 + 2*Pi).
 * @author Sean A. Irvine
 */
public class A197682 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197682() {
    super(CR.PI.divide(CR.TWO.add(CR.TWO.multiply(CR.PI))));
  }
}

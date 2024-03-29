package irvine.oeis.a195;
// Generated by gen_seq4.pl decexp at 2021-07-18 18:00

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195292 Decimal expansion of normalized Philo sum, Philo(ABC,I), where I=incenter of a 7,24,25 right triangle ABC.
 * Formula: 9/49*2^(1/2)+15/112
 * @author Georg Fischer
 */
public class A195292 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195292() {
    super(0, CR.NINE.divide(CR.valueOf(49)).multiply(CR.TWO.sqrt()).add(CR.valueOf(15).divide(CR.valueOf(112))));
  }
}

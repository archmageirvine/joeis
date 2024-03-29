package irvine.oeis.a195;
// Generated by gen_seq4.pl decexp at 2021-07-18 18:00

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195297 Decimal expansion of normalized Philo sum, Philo(ABC,I), where I=incenter of an 8,15,17 right triangle ABC.
 * Formula: 1/400*(12*2^(1/2)+15)*17^(1/2)+3/20*2^(1/2)
 * @author Georg Fischer
 */
public class A195297 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195297() {
    super(0, CR.ONE.divide(CR.valueOf(400)).multiply(CR.valueOf(12).multiply(CR.TWO.sqrt()).add(CR.valueOf(15))).multiply(CR.valueOf(17).sqrt()).add(CR.THREE.divide(CR.valueOf(20)).multiply(CR.TWO.sqrt())));
  }
}

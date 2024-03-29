package irvine.oeis.a195;
// Generated by gen_seq4.pl decexp at 2021-07-18 18:00

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195358 Decimal expansion of normalized Philo sum, Philo(ABC,I), where I=incenter of a 2,3,sqrt(13) right triangle ABC.
 * Formula: ((12*13^(1/2)+36)*(26+4*13^(1/2))^(1/2)+(12*13^(1/2)+24)*(26+6*13^(1/2))^(1/2)+60*13^(1/2)*2^(1/2)+228*2^(1/2))/(5+13^(1/2))^2/(3+13^(1/2))/(13^(1/2)+2)
 * @author Georg Fischer
 */
public class A195358 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195358() {
    super(0, CR.valueOf(12).multiply(CR.valueOf(13).sqrt()).add(CR.valueOf(36)).multiply(CR.valueOf(26).add(CR.FOUR.multiply(CR.valueOf(13).sqrt())).sqrt()).add(CR.valueOf(12).multiply(CR.valueOf(13).sqrt()).add(CR.valueOf(24)).multiply(CR.valueOf(26).add(CR.SIX.multiply(CR.valueOf(13).sqrt())).sqrt())).add(CR.valueOf(60).multiply(CR.valueOf(13).sqrt()).multiply(CR.TWO.sqrt())).add(CR.valueOf(228).multiply(CR.TWO.sqrt())).divide(CR.FIVE.add(CR.valueOf(13).sqrt()).pow(CR.TWO)).divide(CR.THREE.add(CR.valueOf(13).sqrt())).divide(CR.valueOf(13).sqrt().add(CR.TWO)));
  }
}

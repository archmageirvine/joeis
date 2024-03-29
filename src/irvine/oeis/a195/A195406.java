package irvine.oeis.a195;
// Generated by gen_seq4.pl decexp at 2021-07-18 18:00

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195406 Decimal expansion of normalized Philo sum, Philo(ABC,I), where I=incenter of  the right triangle ABC having sidelengths (a,b,c)=(1,sqrt(r),r), where r=(1+sqrt(5))/2 (the golden ratio).
 * Formula: 2*phi^(1/2)*((phi+2*phi^(3/2)+phi^2+1)^(1/2)*(phi+1)+(phi^2+3*phi+1)^(1/2)*(phi^(1/2)+phi)+(phi^(3/2)+phi^2+phi^(1/2)+phi)*2^(1/2))/(1+phi^(1/2)+phi)^2/(phi^(1/2)+phi)/(phi+1)
 * @author Georg Fischer
 */
public class A195406 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195406() {
    super(0, CR.TWO.multiply(CR.PHI.sqrt()).multiply(CR.PHI.add(CR.TWO.multiply(CR.PHI.pow(CR.THREE.divide(CR.TWO)))).add(CR.PHI.pow(CR.TWO)).add(CR.ONE).sqrt().multiply(CR.PHI.add(CR.ONE)).add(CR.PHI.pow(CR.TWO).add(CR.THREE.multiply(CR.PHI)).add(CR.ONE).sqrt().multiply(CR.PHI.sqrt().add(CR.PHI))).add(CR.PHI.pow(CR.THREE.divide(CR.TWO)).add(CR.PHI.pow(CR.TWO)).add(CR.PHI.sqrt()).add(CR.PHI).multiply(CR.TWO.sqrt()))).divide(CR.ONE.add(CR.PHI.sqrt()).add(CR.PHI).pow(CR.TWO)).divide(CR.PHI.sqrt().add(CR.PHI)).divide(CR.PHI.add(CR.ONE)));
  }
}

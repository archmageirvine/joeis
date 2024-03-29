package irvine.oeis.a195;
// Generated by gen_seq4.pl decexp at 2021-07-18 18:00

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195408 Decimal expansion of shortest length, (B), of segment from side BC through incenter to side BA in right triangle ABC with sidelengths (a,b,c)=(r-1,r,sqrt(3)), where r=(1+sqrt(5))/2 (the golden ratio).
 * Formula: 2*(phi-1)*phi*((2*phi-2)*3^(1/2)+2*phi^2-2*phi+4)^(1/2)/(2*phi-1+3^(1/2))/(3^(1/2)+phi-1)
 * @author Georg Fischer
 */
public class A195408 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195408() {
    super(0, CR.TWO.multiply(CR.PHI.subtract(CR.ONE)).multiply(CR.PHI).multiply(CR.TWO.multiply(CR.PHI).subtract(CR.TWO).multiply(CR.THREE.sqrt()).add(CR.TWO.multiply(CR.PHI.pow(CR.TWO))).subtract(CR.TWO.multiply(CR.PHI)).add(CR.FOUR).sqrt()).divide(CR.TWO.multiply(CR.PHI).subtract(CR.ONE).add(CR.THREE.sqrt())).divide(CR.THREE.sqrt().add(CR.PHI).subtract(CR.ONE)));
  }
}

package irvine.oeis.a195;
// Generated by gen_seq4.pl decexp at 2021-07-18 18:00

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195403 Decimal expansion of shortest length, (A), of segment from side AB through incenter to side AC in right triangle ABC with sidelengths (a,b,c)=(1,sqrt(r),r), where r=(1+sqrt(5))/2 (the golden ratio).
 * Formula: 2*phi^(1/2)*(phi+2*phi^(3/2)+phi^2+1)^(1/2)/(1+phi^(1/2)+phi)/(phi^(1/2)+phi)
 * @author Georg Fischer
 */
public class A195403 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A195403() {
    super(0, CR.TWO.multiply(CR.PHI.sqrt()).multiply(CR.PHI.add(CR.TWO.multiply(CR.PHI.pow(CR.THREE.divide(CR.TWO)))).add(CR.PHI.pow(CR.TWO)).add(CR.ONE).sqrt()).divide(CR.ONE.add(CR.PHI.sqrt()).add(CR.PHI)).divide(CR.PHI.sqrt().add(CR.PHI)));
  }
}

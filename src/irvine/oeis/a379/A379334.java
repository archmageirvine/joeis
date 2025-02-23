package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A379334 Decimal expansion of the minimum value of the function s(t) = (Pi + 2*sqrt(1 + t^2))/(1 + Pi/2 + t) for t &gt; 0.
 * Formula:
 * @author Georg Fischer
 */
public class A379334 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A379334() {
    super(1, CR.TWO.multiply(CR.PI.add(CR.PI.square()).add(CR.EIGHT.add(CR.PI.pow(3)).add(CR.FOUR.multiply(CR.PI).multiply(CR.THREE.add(CR.TWO.add(CR.PI).sqrt()))).add(CR.PI.square().multiply(CR.SEVEN.add(CR.TWO.multiply(CR.TWO.add(CR.PI).sqrt())))).sqrt())).divide(CR.FOUR.add(CR.PI.square()).add(CR.PI.multiply(CR.FOUR.add(CR.TWO.add(CR.PI).sqrt())))));
  }
}

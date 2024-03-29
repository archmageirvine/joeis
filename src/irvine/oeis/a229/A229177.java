package irvine.oeis.a229;
// Generated by gen_seq4.pl dex CR.THREE.add(CR.THREE.log().divide(CR.TWO.log())).add(CR.THREE.add(CR.THREE.log().divide(CR.TWO.log())).log().divide(CR.TWO.log())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A229177 Decimal expansion of 3 + log_2(3) + log_2(3 + log_2(3)).
 * @author Georg Fischer
 */
public class A229177 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A229177() {
    super(CR.THREE.add(CR.THREE.log().divide(CR.TWO.log())).add(CR.THREE.add(CR.THREE.log().divide(CR.TWO.log())).log().divide(CR.TWO.log())));
  }
}

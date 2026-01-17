package irvine.oeis.a355;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A355954 Decimal expansion of the constant A in the asymptotic behavior R(d) = log(d)/(Pi*sqrt(3)) + A of the resistance between two nodes separated by the Euclidean distance d in an infinite triangular lattice of one-ohm resistors.
 * @author Sean A. Irvine
 */
public class A355954 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A355954() {
    super(0, CR.GAMMA.add(CR.valueOf(12).log().divide(CR.TWO)).divide(CR.PI).divide(CR.THREE.sqrt()));
  }
}

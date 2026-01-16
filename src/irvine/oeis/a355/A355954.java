package irvine.oeis.a355;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392098 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A355954 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A355954() {
    super(0, CR.GAMMA.add(CR.valueOf(12).log().divide(CR.TWO)).divide(CR.PI).divide(CR.THREE.sqrt()));
  }
}

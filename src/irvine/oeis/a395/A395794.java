package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A083566.
 * @author Sean A. Irvine
 */
public class A395794 extends DecimalExpansionSequence {

  private static final CR C = CR.THREE.sqrt().divide(2);

  /** Construct the sequence. */
  public A395794() {
    super(1, CrFunctions.ELLIPTIC_E.cr(C).multiply(new Q(71, 45)).subtract(CrFunctions.ELLIPTIC_K.cr(C).multiply(new Q(19, 90))));
  }
}

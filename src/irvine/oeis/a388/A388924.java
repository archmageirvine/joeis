package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388924 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388924 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388924() {
    super(0, CrFunctions.GAMMA.cr(new Q(2, 3)).square().multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).square()).multiply(CR.TWO.add(CR.THREE.sqrt()).divide(4)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}

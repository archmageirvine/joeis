package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388935 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388935 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388935() {
    super(0, CR.TWO.pow(new Q(3, 5)).multiply(new Q(8, 125)).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(3)).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(3)).multiply(CR.FIVE.sqrt().subtract(1).divide(4).pow(3)).multiply(CR.FIVE.sqrt().add(1).divide(4).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(6)));
  }
}

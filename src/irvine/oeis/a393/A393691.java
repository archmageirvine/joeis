package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.a388.A388042;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393691 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A393691 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393691() {
    super(0, new A388042().getCR().subtract(CR.PI.divide(4).multiply(CR.PI.pow(3).multiply(4).divide(CrFunctions.GAMMA.cr(Q.ONE_QUARTER).pow(4)).log())));
  }
}


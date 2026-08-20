package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.a065.A065442;
import irvine.oeis.a065.A065443;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086311 Decimal expansion of constant appearing in the variance for searching in a digital tree.
 * @author Sean A. Irvine
 */
public class A086311 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086311() {
    super(1, CR.PI.square().add(6).divide(CR.LOG2.square().multiply(6)).add(new Q(1, 12)).subtract(new A065442().getCR()).subtract(new A065443().getCR()));
  }
}

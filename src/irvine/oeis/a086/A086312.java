package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.a065.A065442;
import irvine.oeis.a065.A065443;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086312 Decimal expansion of constant appearing in the variance for inserting in a digital tree.
 * @author Sean A. Irvine
 */
public class A086312 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086312() {
    super(0, CR.PI.square().divide(CR.LOG2.square().multiply(6)).add(new Q(1, 12)).subtract(new A065442().getCR()).subtract(new A065443().getCR()));
  }
}

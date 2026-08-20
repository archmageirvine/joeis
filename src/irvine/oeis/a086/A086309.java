package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.a065.A065442;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086309 Decimal expansion of constant appearing in the expected number of comparisons for a successful digital tree search (negated).
 * @author Sean A. Irvine
 */
public class A086309 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086309() {
    super(0, CR.GAMMA.subtract(1).divide(CR.LOG2).add(new Q(3, 2)).subtract(new A065442().getCR()).negate());
  }
}


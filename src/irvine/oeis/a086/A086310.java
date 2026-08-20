package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.oeis.a065.A065442;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086310 Decimal expansion of constant appearing in the expected number of comparisons for an unsuccessful digital tree search (negated).
 * @author Sean A. Irvine
 */
public class A086310 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086310() {
    super(0, CR.GAMMA.divide(CR.LOG2).add(CR.HALF).subtract(new A065442().getCR()).negate());
  }
}


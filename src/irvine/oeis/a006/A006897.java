package irvine.oeis.a006;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000088;

/**
 * A006897 a(n) is the number of hierarchical linear models on n unlabeled factors allowing 2-way interactions (but no higher order interactions); or the number of unlabeled simple graphs with &lt;= n nodes.
 * @author Sean A. Irvine
 */
public class A006897 extends PartialSumSequence {

  /** Construct the sequence. */
  public A006897() {
    super(new A000088());
  }
}

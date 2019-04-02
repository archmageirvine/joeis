package irvine.oeis.a006;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000088;

/**
 * A006897 Hierarchical linear models on n factors allowing 2-way interactions; or graphs with &lt;= n nodes.
 * @author Sean A. Irvine
 */
public class A006897 extends PartialSumSequence {

  /** Construct the sequence. */
  public A006897() {
    super(new A000088());
  }
}

package irvine.oeis.a036;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001190;

/**
 * A036656 Number of n-node rooted unlabeled trees with outdegree &lt;= 2 and exactly 1 edge at the root.
 * @author Sean A. Irvine
 */
public class A036656 extends PrependSequence {

  /** Construct the sequence. */
  public A036656() {
    super(new SkipSequence(new A001190(), 3), 0, 0, 1);
  }
}

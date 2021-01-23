package irvine.oeis.a036;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001190;

/**
 * A036657 Number of n-node rooted unlabeled trees with out-degree &lt;=2 and exactly 2 edges at the root.
 * @author Sean A. Irvine
 */
public class A036657 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036657() {
    super(new PrependSequence(new SkipSequence(new A001190(), 1), 1));
  }
}

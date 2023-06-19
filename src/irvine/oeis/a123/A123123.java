package irvine.oeis.a123;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a048.A048974;

/**
 * A123123 Numbers m such that m mod k = 2 for only one integer k in 2..m.
 * @author Georg Fischer
 */
public class A123123 extends PrependSequence {

  /** Construct the sequence. */
  public A123123() {
    super(new A048974().skip(1), 5, 6);
  }
}

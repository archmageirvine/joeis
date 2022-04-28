package irvine.oeis.a123;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002024;

/**
 * A123578 The Kruskal-Macaulay function M_2(n).
 * @author Georg Fischer
 */
public class A123578 extends PrependSequence {

  /** Construct the sequence. */
  public A123578() {
    super(new A002024(), 0);
  }
}

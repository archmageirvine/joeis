package irvine.oeis.a123;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a048.A048974;

/**
 * A123123 Numbers n such that, modulo k with 2&lt;=k&lt;=n, only one of the residues is equal to 2.
 * @author Georg Fischer
 */
public class A123123 extends PrependSequence {

  /** Construct the sequence. */
  public A123123() {
    super(1, new A048974(), 5, 6);
  }
}

package irvine.oeis.a357;
// manually convinv/rootet at 2023-02-21 12:58

import irvine.oeis.a003.A003263;
import irvine.oeis.transform.RootSequence;

/**
 * A357383 Expansion of Product_{k&gt;=1} 1 / (1 + x^Lucas(k)).
 * @author Georg Fischer
 */
public class A357383 extends RootSequence {

  /** Construct the sequence. */
  public A357383() {
    super(0, new A003263(), -1, 1);
  }
}

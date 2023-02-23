package irvine.oeis.a104;
// manually convinv/rootet at 2023-02-21 22:24

import irvine.oeis.SkipSequence;
import irvine.oeis.a209.A209229;
import irvine.oeis.transform.RootSequence;

/**
 * A104977 Defining sequence for an inverse Fredholm-Rueppel triangle.
 * @author Georg Fischer
 */
public class A104977 extends RootSequence {

  /** Construct the sequence. */
  public A104977() {
    super(0, new SkipSequence(new A209229(), 2), -1, 1);
  }
}

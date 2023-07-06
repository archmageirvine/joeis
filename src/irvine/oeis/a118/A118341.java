package irvine.oeis.a118;

import irvine.oeis.a108.A108447;
import irvine.oeis.transform.RootSequence;

/**
 * A118341 Self-convolution square of A108447.
 * @author Georg Fischer
 */
public class A118341 extends RootSequence {

  /** Construct the sequence. */
  public A118341() {
    super(0, new A108447().skip(1), 2, 1);
  }
}

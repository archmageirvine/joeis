package irvine.oeis.a118;

import irvine.oeis.a108.A108447;
import irvine.oeis.transform.RootSequence;

/**
 * A118342 Self-convolution cube of A108447.
 * @author Georg Fischer
 */
public class A118342 extends RootSequence {

  /** Construct the sequence. */
  public A118342() {
    super(0, new A108447().skip(1), 3, 1);
  }
}

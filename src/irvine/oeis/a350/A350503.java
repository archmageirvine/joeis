package irvine.oeis.a350;

import irvine.oeis.a023.A023887;
import irvine.oeis.transform.RootSequence;

/**
 * A350503 Self-convolution of sigma_n(n).
 * @author Georg Fischer
 */
public class A350503 extends RootSequence {

  /** Construct the sequence. */
  public A350503() {
    super(1, new A023887().skip(1), 2, 1);
  }
}

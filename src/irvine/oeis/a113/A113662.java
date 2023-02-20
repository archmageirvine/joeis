package irvine.oeis.a113;
// manually rootet at 2023-02-20 10:45

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000699;
import irvine.oeis.transform.RootSequence;

/**
 * A113662 Self-convolution of A000699.
 * @author Georg Fischer
 */
public class A113662 extends RootSequence {

  /** Construct the sequence. */
  public A113662() {
    super(0, new SkipSequence(new A000699(), 2), 2, 1);
  }
}

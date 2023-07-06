package irvine.oeis.a187;

import irvine.oeis.a007.A007820;
import irvine.oeis.transform.RootSequence;

/**
 * A187655 Self-convolution of the central Stirling numbers of the second kind.
 * @author Georg Fischer
 */
public class A187655 extends RootSequence {

  /** Construct the sequence. */
  public A187655() {
    super(0, new A007820().skip(1), 2, 1);
  }
}

package irvine.oeis.a277;
// manually rootet at 2023-02-20 10:45

import irvine.oeis.a047.A047053;
import irvine.oeis.transform.RootSequence;

/**
 * A277362 Self-convolution of a(n)/4^n gives factorials (A000142).
 * @author Georg Fischer
 */
public class A277362 extends RootSequence {

  /** Construct the sequence. */
  public A277362() {
    super(0, new A047053().skip(1), 1, 2);
  }
}

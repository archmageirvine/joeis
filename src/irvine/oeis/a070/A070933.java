package irvine.oeis.a070;
// manually euleras at 2021-11-23 09:22

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000031;

/**
 * A070933 Expansion of Product_{k&gt;=1} 1/(1 - 2*t^k).
 * @author Georg Fischer
 */
public class A070933 extends EulerTransform {

  /** Construct the sequence. */
  public A070933() {
    super(new SkipSequence(new A000031(), 1), 1);
  }
}

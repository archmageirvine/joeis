package irvine.oeis.a246;

import irvine.oeis.a000.A000120;
import irvine.oeis.transform.RunLengthTransformSequence;

/**
 * A246588 Run Length Transform of S(n) = wt(n) = 0,1,1,2,1,2,2,3,1,... (cf. A000120).
 * @author Georg Fischer
 */
public class A246588 extends RunLengthTransformSequence {

  /** Construct the sequence. */
  public A246588() {
    super(0, new A000120());
  }
}

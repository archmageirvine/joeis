package irvine.oeis.a080;

import irvine.oeis.SkipSequence;
import irvine.oeis.a003.A003849;
import irvine.oeis.transform.RootSequence;

/**
 * A080845 G.f. is 1/F, where x*F is g.f. for Fibonacci word (A003849).
 * @author Georg Fischer
 */
public class A080845 extends RootSequence {

  /** Construct the sequence. */
  public A080845() {
    super(0, new SkipSequence(new A003849(), 2), -1, 1);
  }
}

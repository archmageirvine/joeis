package irvine.oeis.a182;
// manually rootet at 2023-02-20 10:45

import irvine.oeis.a027.A027907;
import irvine.oeis.transform.RootSequence;

/**
 * A182153 G.f.: [Sum_{n&gt;=0} x^(n^2) * (1+x+x^2)^n ]^2.
 * @author Georg Fischer
 */
public class A182153 extends RootSequence {

  /** Construct the sequence. */
  public A182153() {
    super(0, new A027907().skip(1), 2, 1);
  }
}
